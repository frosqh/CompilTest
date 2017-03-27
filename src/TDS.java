import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

public class TDS {
	private Scope currentScope;
	private Scope temp;
	
	public TDS(){
		currentScope = new Scope("General");
	}
	
	public void goBack(){
		currentScope = currentScope.getAncestor();
		//System.out.println("On est maintenant dans " + currentScope.getOrigin());
	}
	
	public boolean add(BaseTree t){
		switch (t.toString()){
		case "var" : //Si on veut cr�er une variable
			currentScope.add("var",t.getChildren());
			return false;
		case "class" : //On est dans une cr�ation de classe
			currentScope.addSolo("class", t.getChild(0));
			temp= new Scope(t.getChild(0).toString(), currentScope);
			currentScope.addScopeNotInner(t.getChild(0).toString(), temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());

			return true;
		case "method" : //On est dans une cr�ation de m�thode
			currentScope.addMethod("method", t.getChild(0));
			temp = new Scope(t.getChild(0).toString(), currentScope);
			currentScope.addScopeNotInner(t.getChild(0).toString(), temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());

			return true;
		case "Inner" : //On est dans un bloc interne
			temp = new Scope("Inner", currentScope);
			currentScope.addScopeInner(temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());
			return true;
		case "then" : // On est dans la premi�re branche d'un If
			temp = new Scope("then", currentScope);
			currentScope.addScopeInner(temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());

			return true;
		case "else" : // On est dans la seconde branche d'un If
			temp = new Scope("else", currentScope);
			currentScope.addScopeInner(temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());

			return true;
		case "do" : //On est dans un for
			temp = new Scope("do", currentScope);
			currentScope.addScopeInner(temp);
			currentScope = temp;
			//System.out.println("On est maintenant dans " + currentScope.getOrigin());

			return true;
		default: //On sait pas o� on est
			return false;
		}
	}

	public Scope getScope() {
		return currentScope;
	}
	
	public String toString(){
		return currentScope.toString(1);
	}
}
