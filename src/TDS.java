import java.util.*;

import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

public class TDS {
	private HashMap<String, String> liste = new HashMap<String, String>();
	private Scope currentScope;
	private Scope temp;
	private String[] util = {"DoExpr", "Void", "Inner", "inherit", "class", "var", "method", "if", "then", "fi", "for", "in", 
			"do", "end", "write", "read", "return", "this", "super", "new", "int", "String", ":=", "+", "-", "*", "/", ">", "<", "<=", "==", ">=", "else"};
	private String[] op = {"+", "-", "*", ">", "<", "<=", "==", ">="};
	private int innerCount;
	
	public TDS(){
		currentScope = new Scope("General", null, "General");
	}
	
	public void goBack(){
		if (currentScope.getOrigin().equals("class")){
			for (String t : currentScope.getTable().keySet()){
					currentScope.setDeplacementDynamique(2);
			}
		}
		currentScope = currentScope.getAncestor();
		
		//System.out.println("On est maintenant dans " + currentScope.getOrigin());
	}
	
	@SuppressWarnings("unchecked")
	public int add(BaseTree t) {
		switch (t.toString()){
		case "var" : //Si on veut cr�er une variable
			try {
				currentScope.add("var", (List<BaseTree>) t.getChildren());
				return 0;
			} catch (Exception e) {
				System.out.println("Error : \""+ e.getMessage()+"\"");
				//e.printStackTrace();
			}
			return 2;
		case "class" : //On est dans une cr�ation de classe
			try {
				Tree tree = t.getChild(1);
				if (tree.getText().equals("inherit")){
					currentScope.addSolo("class", t.getChild(0), true);
					temp= new Scope("class", currentScope, t.getChild(0).toString());
					currentScope.addScopeNotInner(t.getChild(0).toString(), temp);
					currentScope = temp;
					Scope scope = currentScope;
					while (!scope.getOrigin().equals("General")){
						scope=scope.getAncestor();
					}
					if (scope.isIn(tree.getChild(0).getText())){
						Scope sc2 = scope.getSecondTable().get(tree.getChild(0).getText());
						currentScope.setDeplacement(sc2.getDeplacement());
						for (String k : sc2.getTable().keySet()){
							ArrayList<String> b = sc2.getTable().get(k);
							b.add("inherit");
							currentScope.getTable().put(k, b);
						}
					}
					else{
						throw new Exception("Class " + tree.getChild(0).getText() + " doesn't exists");
					}
					
				}
				else{
					currentScope.addSolo("class", t.getChild(0));
					temp= new Scope("class", currentScope, t.getChild(0).toString());
					currentScope.addScopeNotInner(t.getChild(0).toString(), temp);
					currentScope = temp;
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
			
				currentScope.addMethod("method", t.getChild(0));
				temp = new Scope("method", currentScope, t.getChild(0).toString());
				currentScope.addScopeNotInner(t.getChild(0).toString(), temp);
				currentScope = temp;

				for (int i = 0; i <= t.getChild(0).getChildCount()-2; i++){
					currentScope.add("var", ((BaseTree) t.getChild(0).getChild(i)));
				}
				//System.out.println("On est maintenant dans " + currentScope.getOrigin());
				return 1;
			} catch (Exception e) {
				System.out.println("Error : \""+ e.getMessage()+"\"");
				//e.printStackTrace();
				if (e.getMessage().startsWith("Var")){
					return 1;
				}
				else{
					return 2;
				}
			}
		case "Inner" : //On est dans un bloc interne
			temp = new Scope("Inner", currentScope, "Inner"+innerCount);
			currentScope.addScopeInner(temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());
			return 1;
		case "for" : //On est dans un for
			main2.forCount++;
			temp = new Scope("for", currentScope, "for"+main2.forCount );
			currentScope.addScopeInner(temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());

			return 1;
		case "in":
			currentScope.addManual("var", "bornefor"+main2.forCount);
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
					if (t1.getText().matches("^-?\\d+$")){}
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
						else{
							throw new Exception(t1.getText() + " is not an Integer");
						}
					}}
				}
				if (aST.getText().equals("-") && t2 == null){
					
				}
				else{
					if (Arrays.asList(op).contains(t2.getText())){
						check(t2, aST);
					}
					else{
						if (t2.getText().matches("^-?\\d+$")){} 
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
								else{
									throw new Exception(t2.getText() + " is not an Integer");
								}
							}
						}
					}
				}
			}
			else{
				if (aST.getText().equals("this")){
					Scope scope = currentScope;
					boolean b = false;
					while (!scope.getOrigin().equals("General")){
						if (scope.getOrigin().equals("class")){
							b = true;
							break;
						}
						scope = scope.getAncestor();
					}
					if (!b){
						throw new Exception("Cannot use this outside of a class");
					}
				}
				else{
					if (aST.getText().equals("super")){
						Scope scope = currentScope;
						boolean b = false;
						while (!scope.getOrigin().equals("General")){
							if (scope.getOrigin().equals("class")){
								b = true;
								break;
							}
							scope = scope.getAncestor();
						}
						if (!b){
							throw new Exception("Cannot use super outside of a class");
						}
						else{
							if (!(scope.getAncestor().getTable().get(scope.getName()).contains("inherit"))){
								System.out.println(scope.getAncestor().getTable().get(scope.getName()));
								throw new Exception("Cannot use super within a class wich do not inheritate");
							}
						}
					}
					if (aST.getText().equals("if")){
						Tree t1 = aST.getChild(0);
						if (Arrays.asList(op).contains(t1.getText())){
							check((BaseTree) t1,aST);
						}
						else{
							if (t1.getText().matches("^-?\\d+$")){}
							else{
								if (currentScope.isIn(t1.getText())){
									if(currentScope.getTable().get(t1.getText()).get(1).equals("int")){}
									else{
										throw new Exception(t1.getText() + " is not an Integer");
									}
								}
								else{
									if (currentScope.isInAncestor(t1.getText())){
										if (currentScope.getFromAncestor(t1.getText()).get(1).equals(("int"))){}
										else{
											throw new Exception(t1.getText() + " is not an Integer");
										}
									}
									else{
										throw new Exception(t1.getText() + " is not an Integer");
									}
								}
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
