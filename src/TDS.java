import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

public class TDS {
	private Scope currentScope;
	private Scope temp;
	private String[] util = {"DoExpr", "Void", "Inner", "inherit", "class", "var", "method", "if", "then", "fi", "for", "in", 
			"do", "end", "write", "read", "return", "this", "super", "new", "int", "String", ":=", "+", "-", "*", "/", ">", "<", "<=", "==",
			"=", ">="};
	
	public TDS(){
		currentScope = new Scope("General");
	}
	
	public void goBack(){
		currentScope = currentScope.getAncestor();
		//System.out.println("On est maintenant dans " + currentScope.getOrigin());
	}
	
	@SuppressWarnings("unchecked")
	public int add(BaseTree t) {
		switch (t.toString()){
		case "var" : //Si on veut cr�er une variable
			try {
				currentScope.add("var",t.getChildren());
				return 0;
			} catch (Exception e) {
				System.out.println("Error : \""+ e.getMessage()+"\"");
				e.printStackTrace();
			}
			return 2;
		case "class" : //On est dans une cr�ation de classe
			try {
				currentScope.addSolo("class", t.getChild(0));
				temp= new Scope(t.getChild(0).toString(), currentScope);
				currentScope.addScopeNotInner(t.getChild(0).toString(), temp);
				currentScope = temp;
				//System.out.println("On est maintenant dans " + currentScope.getOrigin());
				return 1;
			} catch (Exception e) {
				System.out.println("Error : \""+ e.getMessage()+"\"");
				e.printStackTrace();
			}
			return 2;
		case "method" : //On est dans une cr�ation de m�thode
			try {
				currentScope.addMethod("method", t.getChild(0));
				temp = new Scope(t.getChild(0).toString(), currentScope);
				currentScope.addScopeNotInner(t.getChild(0).toString(), temp);
				currentScope = temp;
				for (int i = 0; i <= t.getChild(0).getChildCount()-2; i++){
					currentScope.add("var", ((BaseTree) t.getChild(0).getChild(i)));
				}
				//System.out.println("On est maintenant dans " + currentScope.getOrigin());
				return 1;
			} catch (Exception e) {
				System.out.println("Error : \""+ e.getMessage()+"\"");
				if (e.getMessage().startsWith("Var")){
					return 1;
				}
				else{
					return 2;
				}
				//e.printStackTrace();
			}
		case "Inner" : //On est dans un bloc interne
			temp = new Scope("Inner", currentScope);
			currentScope.addScopeInner(temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());
			return 1;
		case "then" : // On est dans la premi�re branche d'un If
			temp = new Scope("then", currentScope);
			currentScope.addScopeInner(temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());

			return 1;
		case "else" : // On est dans la seconde branche d'un If
			temp = new Scope("else", currentScope);
			currentScope.addScopeInner(temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());

			return 1;
		case "do" : //On est dans un for
			temp = new Scope("do", currentScope);
			currentScope.addScopeInner(temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());

			return 1;
		default: //On sait pas o� on est
			return 0;
		}
	}

	public Scope getScope() {
		return currentScope;
	}
	
	public String toString(){
		return currentScope.toString(1);
	}

	public void check(BaseTree aST) throws Exception {
		if (!Arrays.asList(util).contains(aST.getText())){
			if (aST.getAncestor(0) != null){ //Si c'est genre un appel de fonctions ou un paramètre
				if (Arrays.asList(util).contains(aST.getAncestor(0).getText())){
					String ancetre = aST.getAncestor(0).getText();
					ArrayList<String> ancetreb = null;
					if (currentScope.isIn(ancetre)){
						ancetreb = currentScope.getTable().get(ancetre);
					}
					else{
						ancetreb = currentScope.getFromAncestor(ancetre);
					}
					if (ancetreb.get(0).equals("var")){ //Si c'est un appel de fonctions
						String type = ancetreb.get(1);
						Scope scope = currentScope;
						while (!scope.getOrigin().equals("General")){
							scope=scope.getAncestor();
						}
						Scope a = scope.getSecondTable().get(type);
						if (!a.getTable().containsKey(aST.getText())){
							throw new Exception ("Method " + aST.getText() + " is not defined");
						}
					}
					else{
						if (ancetreb.get(0).equals("method")){
							
						}
					}
				}
			}
			String noeud = aST.getText();
			if (noeud.startsWith("\"")&&noeud.endsWith("\"")&&getNumber(noeud, '"')==2){}
			else{
				if (noeud.matches("^-?\\d+$")){}
				else{
					if (!currentScope.isIn(noeud) && !currentScope.isInAncestor(noeud)){
						throw new Exception ("Object "+noeud+" is not defined");
					}
				}
			}
		}
	}
	
	public int getNumber(String str, char c){
		char tempc;
		int charCount = 0;
		for( int i = 0; i < str.length( ); i++ )
		{
		    tempc = str.charAt( i );

		    if( tempc == c)
		        charCount++;
		}
		return charCount;
	}
}
