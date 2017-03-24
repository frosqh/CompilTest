
public class TDS {
	private Scope currentScope;
	private Scope temp;
	
	public TDS(){
		currentScope = new Scope("General");
	}
	
	
	public void browseTree(Tree t){
		Node n = t.getNode();
		switch (n.getName()){
		case "var" : //Si on veut créer une variable
			currentScope.add("var",n.getArgs());
			break;
		case "class" : //On est dans une création de classe
			currentScope.add("class", n.getFirstArg());
			 temp= new Scope("class", currentScope);
			currentScope = temp;
			break;
		case "method" : //On est dans une création de méthode
			currentScope.addMethod("method", n.getFirstArg());
			temp = new Scope("method", currentScope);
			currentScope = temp;
			break;
		case "Inner" : //On est dans un bloc interne
			temp = new Scope("Inner", currentScope);
			currentScope = temp;
			break;
		case "then" : // On est dans la première branche d'un If
			temp = new Scope("then", currentScope);
			currentScope = temp;
			break;
		case "else" : // On est dans la seconde branche d'un If
			temp = new Scope("else", currentScope);
			currentScope = temp;
			break;
		case "do" : //On est dans un for
			temp = new Scope("do", currentScope);
			currentScope = temp;
			break;
		default: //On sait pas où on est
			break;
		}
	}
}
