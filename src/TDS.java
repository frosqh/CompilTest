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
	
	@SuppressWarnings("unchecked")
	public int add(BaseTree t) {
		switch (t.toString()){
		case "var" : //Si on veut cr�er une variable
			try {
				currentScope.add("var",t.getChildren());
				return 0;
			} catch (Exception e) {
				System.out.println("Error : \""+ e.getMessage()+"\"");
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
				//e.printStackTrace();
			}
			return 2;
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

	public void check(BaseTree aST) {
		switch (aST.toString()){
			
		}
	}
}
