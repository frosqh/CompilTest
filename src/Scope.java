import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

public class Scope {
	private Scope ancestor = null;
	private String origin;
	private ArrayList<Scope> innerScopeList;
	private HashMap<String, ArrayList<String>> table;
	private HashMap<String, Scope> secondTable;
	
	public String toString(int tab){
		if (table.isEmpty()){
			return null;
		}
		String tabu = "";
		for (int i =0 ; i< tab; i++){
			tabu += "    ";
		}
		String s = tabu.substring(0,  tabu.length()-4) + "Scope " + origin +"\n";
		//System.out.println(table);
		for (String k : table.keySet()){
			s += tabu + k + " : " + table.get(k) + "\n";
		}
		if (secondTable != null){
			for (String k : secondTable.keySet()){
				String temp = secondTable.get(k).toString(tab+1);
				if (temp != null){
					s +=temp+ "\n";
				}
			}
		}
		if(innerScopeList != null){
			for (Scope sc : innerScopeList){
				String temp =sc.toString(tab+1);
				if (temp != null){
					s +=temp+ "\n";
				}
			}
		}
		return s;
	}
	
	public Scope(String id, Scope anc){
		table = new HashMap<String, ArrayList<String>>();
		secondTable = new HashMap<String, Scope>();
		setOrigin(id);
		setAncestor(anc);
	}
	
	public ArrayList<Scope> getInnerScopeList() {
		return innerScopeList;
	}

	public void setInnerScopeList(ArrayList<Scope> innerScopeList) {
		this.innerScopeList = innerScopeList;
	}

	public Scope(String id){
		secondTable = new HashMap<String, Scope>();
		table = new HashMap<String, ArrayList<String>>();
		setOrigin(id);
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
				System.out.println("Warning : \"Var name surcharged : " + name+"\"");
			}
			checkType(type);
			ArrayList<String> param = new ArrayList<String>();
			
			param.add(string);
			param.add(type);
			param.add("param");
			
			table.put(name, param);
		}
		else{
			throw new Exception("Var name already used : " + name);
		}
	}

	public void add(String string, List<BaseTree> children) throws Exception {
		String name = children.get(0).toString();
		//System.out.println(name+" "+isIn(name));
		if (!isIn(name)){
			if (isInAncestor(name)){
				System.out.println("Warning : \"Var name surcharged : " + name+"\"");
			}
			String type = children.get(1).toString();
			
			checkType(type);
			
			ArrayList<String> param = new ArrayList<String>();
			param.add(string);
			param.add(type);
			
			table.put(name, param);
		}
		else{
			throw new Exception("Var name already used : " + name);
		}
		
		
	}

	private void checkType(String type) throws Exception {
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

	private ArrayList<String> getFromAncestor(String type) throws Exception {
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
				System.out.println("Warning : \"Method name surcharged : " + name+"\"");
			}
			String returnType;
			if (child.getChildCount() >0){
				returnType = child.getChild(child.getChildCount()-1).toString();
			}
			else{
				returnType = "Void";
			}
			ArrayList<String> param = new ArrayList<String>();
			param.add(string);
			param.add(returnType);
			table.put(name, param);
		}
		else{
			throw new Exception("Method name already used : " + name);
		}
	}

	public void addSolo(String string, Tree child) throws Exception {
		String name = child.toString();
		if (!isIn(name)){
			ArrayList<String> param = new ArrayList<String>();
			param.add(string);
			
			table.put(name, param);
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
	
	public boolean isInAncestor(String name){
		if (ancestor != null){
			return ancestor.isIn(name) || ancestor.isInAncestor(name);
		}
		else{
			return false;
		}
	}

}
