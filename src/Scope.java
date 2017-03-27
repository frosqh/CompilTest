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

	public void add(String string, List<BaseTree> children) {
		String name = children.get(0).toString();
		String type = children.get(1).toString();
		
		ArrayList<String> param = new ArrayList<String>();
		param.add(string);
		param.add(type);
		
		table.put(name, param);
		
	}

	public void addMethod(String string, Tree child) {
		String name = child.toString();
		String returnType;
		if (child.getChildCount() >0){
			returnType = child.getChild(0).toString();
		}
		else{
			returnType = null;
		}
		ArrayList<String> param = new ArrayList<String>();
		param.add(string);
		param.add(returnType);
		table.put(name, param);
	}

	public void addSolo(String string, Tree child) {
		String name = child.toString();
		
		ArrayList<String> param = new ArrayList<String>();
		param.add(string);
		
		table.put(name, param);
		
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

}
