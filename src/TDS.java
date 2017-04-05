import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

public class TDS {
	private HashMap<String, String> liste = new HashMap<String, String>();
	private Scope currentScope;
	private Scope temp;
	private String[] util = {"DoExpr", "Void", "Inner", "inherit", "class", "var", "method", "if", "then", "fi", "for", "in", 
			"do", "end", "write", "read", "return", "this", "super", "new", "int", "String", ":=", "+", "-", "*", "/", ">", "<", "<=", "==", ">=", "else"};
	private String[] op = {"+", "-", "*", "/", ">", "<", "<=", "==", ">="};
	
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
				//e.printStackTrace();
			}
			return 2;
		case "class" : //On est dans une cr�ation de classe
			try {
				Tree tree = t.getChild(1);
				currentScope.addSolo("class", t.getChild(0));
				temp= new Scope(t.getChild(0).toString(), currentScope);
				currentScope.addScopeNotInner(t.getChild(0).toString(), temp);
				currentScope = temp;
				if (tree.getText().equals("inherit")){
					Scope scope = currentScope;
					while (!scope.getOrigin().equals("General")){
						scope=scope.getAncestor();
					}
					Scope sc2 = scope.getSecondTable().get(tree.getChild(0).getText());
					for (String k : sc2.getTable().keySet()){
						ArrayList<String> b = sc2.getTable().get(k);
						b.add("inherit");
						currentScope.getTable().put(k, b);
					}
					
				}
				//System.out.println("On est maintenant dans " + currentScope.getOrigin());
				return 1;
			} catch (Exception e) {
				System.out.println("Error : \""+ e.getMessage()+"\"");
				//e.printStackTrace();
			}
			return 2;
		case "method" : //On est dans une cr�ation de m�thode
			try {
				int c = t.getChildCount();
				boolean b =false;
				for (int i =0; i<c; i++){
					if (t.getChild(i).getText().equals("return")){
						b=true;
					}
				}
				if (!b){
					throw new Exception("Function " + t.getChild(0).getText() + " doesn't return anything");
				}
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

	public HashMap<String, String> getListe() {
		return liste;
	}


	public Scope getScope() {
		return currentScope;
	}
	
	public String toString(){
		return currentScope.toString(1);
	}

	public void check(BaseTree aST, BaseTree parent) throws Exception {
		if (!Arrays.asList(util).contains(aST.getText())){
			if (parent.getText() != null){ //Si c'est genre un appel de fonctions ou un paramètre
				if (!Arrays.asList(util).contains(parent.getText())){
					String ancetre = parent.getText();
					//System.out.println(ancetre);
					if (!liste.get(ancetre).equals("method")){
						
						ArrayList<String> ancetreb = null;
						if (currentScope.isIn(ancetre)){
							
							ancetreb = currentScope.getTable().get(ancetre);
						}
						else{
							ancetreb = currentScope.getFromAncestor(ancetre);
						}
						//System.out.println(ancetreb);
						if (ancetreb.get(0).equals("var")){ //Si c'est un appel de fonctions
							String type = ancetreb.get(1);
							Scope scope = currentScope;
							while (!scope.getOrigin().equals("General")){
								scope=scope.getAncestor();
							}
							if (type.equals("int") || type.equals("String")){
								throw new Exception ("Method " + aST.getText() + " is not defined for type " + type);
							}
							Scope a = scope.getSecondTable().get(type);
							if (!a.getTable().containsKey(aST.getText())){
								throw new Exception ("Method " + aST.getText() + " is not defined for type " + type);
							}
							
							Scope v = a.getSecondTable().get(aST.getText());
							Collection<ArrayList<String>> c3 = v.getTable().values();
							int c = 0;
							for (ArrayList<String> l : c3){
								if (l.contains("param")){
									c++;
								}
							}
							int c2 = aST.getChildCount();
							if (c!=c2){
								throw new Exception ("More paramaters required for " + aST.getText());
							}
							
							
							
							//System.out.println(a.getTable().get(aST.getText()).get(0));
						}
						else{
							if (ancetreb.get(0).equals("method")){
								
							}
						}
					}
				}
			}
			String noeud = aST.getText();
			if (noeud.startsWith("\"")&&noeud.endsWith("\"")&&getNumber(noeud, '"')==2){}
			else{
				if (noeud.matches("^-?\\d+$")){}
				else{
					//System.out.println(noeud);
					if (!liste.containsKey(noeud)){
						throw new Exception ("Object "+noeud+" is not defined");
					}
				}
			}
		}
		else{
			if (Arrays.asList(op).contains(aST.getText())){
				BaseTree t1 = (BaseTree) aST.getChild(0);
				BaseTree t2 = (BaseTree) aST.getChild(1);
				if (Arrays.asList(op).contains(t1.getText())){
					check(t1, aST);
				}
				else{
					if (currentScope.isIn(t1.getText())){
						ArrayList<String> k = currentScope.getTable().get(t1.getText());
						if (!k.get(1).equals("int")){
							throw new Exception (t1.getText() + " is not an Integer");
						}
					}
					else{
						if (currentScope.isInAncestor(t1.getText())){
							ArrayList<String> k = currentScope.getFromAncestor(t1.getText());
							if (!k.get(1).equals("int")){
								throw new Exception (t1.getText() + " is not an Integer");
							}
						}
					}
				}
				if (Arrays.asList(op).contains(t2.getText())){
					check(t2, aST);
				}
				else{
					if (currentScope.isIn(t2.getText())){
						ArrayList<String> k = currentScope.getTable().get(t2.getText());
						if (!k.get(1).equals("int")){
							throw new Exception (t2.getText() + " is not an Integer");
						}
					}
					else{
						if (currentScope.isInAncestor(t2.getText())){
							ArrayList<String> k = currentScope.getFromAncestor(t2.getText());
							if (!k.get(1).equals("int")){
								throw new Exception (t2.getText() + " is not an Integer");
							}
						}
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
