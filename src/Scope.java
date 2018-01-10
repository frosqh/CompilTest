import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

@SuppressWarnings("unchecked")
public class Scope {
	private Scope ancestor = null;
	private String origin;
	private ArrayList<Scope> innerScopeList = new ArrayList<>();
	private HashMap<String, ArrayList<String>> table;
	private HashMap<String, Scope> secondTable;
	private String name;
	private int deplacement;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(int tab){
		if (table.isEmpty()){
			return null;
		}
		StringBuilder tabu = new StringBuilder();
		for (int i =0 ; i< tab; i++){
			tabu.append("    ");
		}
		StringBuilder s = new StringBuilder(tabu.substring(0, tabu.length() - 4) + "Scope " + name + "\n");
		for (String k : table.keySet()){
			s.append(tabu).append(k).append(" : ").append(table.get(k)).append("\n");
		}
		if (secondTable != null){
			for (String k : secondTable.keySet()){
				String temp = secondTable.get(k).toString(tab+1);
				if (temp != null){
					s.append(temp).append("\n");
				}
			}
		}
		if(innerScopeList != null){
			for (Scope sc : innerScopeList){
				String temp =sc.toString(tab+1);
				if (temp != null){
					s.append(temp).append("\n");
				}
			}
		}
		return s.toString();
	}
	
	public Scope(String id, Scope anc, String string){
		table = new HashMap<>();
		secondTable = new HashMap<>();
		if (anc != null)
			deplacement = anc.getDeplacement();
		else
			deplacement = 2;
		setOrigin(id);
		setAncestor(anc);
		setName(string);
	}
	
	public int getDeplacement() {
		return deplacement;
	}

	public ArrayList<Scope> getInnerScopeList() {
		return innerScopeList;
	}

	public void setInnerScopeList(ArrayList<Scope> innerScopeList) {
		this.innerScopeList = innerScopeList;
	}

	public Scope(String id){
		secondTable = new HashMap<>();
		table = new HashMap<>();
		setOrigin(id);
		deplacement = 2;
	}
	
	public HashMap<String, Scope> getSecondTable() {
		return secondTable;
	}

	public void setSecondTable(HashMap<String, Scope> secondTable) {
		this.secondTable = secondTable;
	}

	public void addScopeInner(Scope sc){
		innerScopeList.add(sc);
	}
	
	
	public Scope getAncestor() {
		return ancestor;
	}

	public void setAncestor(Scope ancestor) {
		this.ancestor = ancestor;
	}
	
	public void add(String string, BaseTree child) throws Exception{
		String name = child.getText();
		String type = child.getChild(0).getText();
		if (!isIn(name)){
			if (isInAncestor(name)){
				System.out.println("Warning : \"Var name surcharged : " + name+"\" at "+child.getLine()+":"+child.getCharPositionInLine());
			}
			checkType(type, child.getLine(), child.getCharPositionInLine());
			int deplacement = 0;
			if (type.equals("int"))
				deplacement = this.deplacement;
				this.deplacement+=2;
			ArrayList<String> param = new ArrayList<>();
			
			param.add(string);
			param.add(type);
			param.add(String.valueOf(deplacement));
			param.add("param");
			
			table.put(name, param);
			main2.Tds.getListe().put(name, "var");
		}
		else{
			throw new Exception("Var name already used : " + name +" at "+child.getLine()+":"+child.getCharPositionInLine());
		}
	}

	public void add(String string, List<BaseTree> children) throws Exception {
		String name = children.get(0).toString();
		if (!isIn(name)){
			if (isInAncestor(name)){
				System.out.println("Warning : \"Var name surcharged : " + name+"\" at "+children.get(0).getLine()+":"+children.get(0).getCharPositionInLine());
			}
			String type = children.get(1).toString();

			checkType(type, children.get(0).getLine(), children.get(0).getCharPositionInLine());
			int deplacement = 0;
			if (type.equals("int"))
				deplacement = this.deplacement;
				this.deplacement+=2;
			
			ArrayList<String> param = new ArrayList<>();
			param.add(string);
			param.add(type);
			param.add(String.valueOf(deplacement));
			
			table.put(name, param);
			main2.Tds.getListe().put(name, "var");
		}
		else{
			throw new Exception("Var name already used : " + name  +"at "+children.get(0).getLine()+":"+children.get(0).getCharPositionInLine());
		}
		
		
	}

	private void checkType(String type, int line, int posLine) throws Exception {
		if (!type.equals("int") && !type.equals("String")){
			if (isIn(type)){
				if (!table.get(type).get(0).equals("class")){
					throw new Exception(type + " is not a type");
				}
			}
			else{
				if (isInAncestor(type)){
					if (!getFromAncestor(type).get(0).equals("class")){
						throw new Exception(type + " is not a type");
					}
				}
				else{
					throw new Exception(type + " is not a type");
				}
			}
		}
		
	}

	public ArrayList<String> getFromAncestor(String type) throws Exception {
		if (!isInAncestor(type)){
			throw new Exception(type + " is not in ancestor");
		}
		else{
			if (getAncestor().isIn(type)){
				return getAncestor().getTable().get(type);
			}
			else{
				return getAncestor().getFromAncestor(type);
			}
		}
	}

	public void addMethod(String string, Tree child) throws Exception {
		String name = child.toString();
		if (!isIn(name)){
			if (isInAncestor(name)){
				System.out.println("Warning : \"Method name surcharged : " + name+"\" at "+child.getLine()+":"+child.getCharPositionInLine());
			}
			String returnType;
			if (child.getChildCount() >0){
				returnType = child.getChild(child.getChildCount()-1).toString();
			}
			else{
				returnType = "Void";
			}
			ArrayList<String> param = new ArrayList<>();
			param.add(string);
			param.add(returnType);
			table.put(name, param);
			main2.Tds.getListe().put(name, "method");
		}
		else{
			if (getTable().get(name).contains("inherit")){
				getTable().remove(name);
				addMethod(string, child);
				System.out.println("Warning : \"Method name surcharged : " + name+"\" at "+child.getLine()+":"+child.getCharPositionInLine());
			}
			else{
				throw new Exception("Method name already used : " + name);
			}
		}
	}

	public void setDeplacement(int deplacement) {
		this.deplacement = deplacement;
	}

	public void addSolo(String string, Tree child) throws Exception {
		addSolo(string, child, false);
		
	}
	
	public void addSolo(String string, Tree child, boolean b) throws Exception {
		String name = child.toString();
		if (!isIn(name)){
			ArrayList<String> param = new ArrayList<>();
			param.add(string);
			if (b)
				param.add("inherit");
			param.add(String.valueOf(main2.deplacementDynamique));
			table.put(name, param);
			main2.Tds.getListe().put(name, "class");
		}
		else{
			throw new Exception("Class name already used : " + name);
		}
	}
	
	public HashMap<String, ArrayList<String>> getTable() {
		return table;
	}

	public void setTable(HashMap<String, ArrayList<String>> table) {
		this.table = table;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void addScopeNotInner(String string, Scope temp) {
		secondTable.put(string, temp);
		
	}
	
	public boolean isIn(String name){
		return table.containsKey(name);
	}
	
	public boolean isInAncestor(String name) {
        return ancestor != null && (ancestor.isIn(name) || ancestor.isInAncestor(name));
    }

	public ArrayList<String> find(String text) throws Exception {
		if (isIn(text)){
			return getTable().get(text);
		}
		else{
			return getFromAncestor(text);
		}
		
	}

	public void addManual(String string, String string2) {
		int deplacement = this.deplacement;
		this.deplacement+=2;
		ArrayList<String> param = new ArrayList<>();
		param.add(string);
		param.add("int");
		param.add(String.valueOf(deplacement));
		table.put(string2, param);
		
	}

	public void setDeplacementDynamique(int i) {
		main2.deplacementDynamique += (i);
		
	}

}
