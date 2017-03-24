import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Scope {
	private Scope ancestor = null;
	private String origin;
	private ArrayList<Scope> innerScopeList;
	private HashMap<String, ArrayList<String>> table;
	
	public Scope(String id, Scope anc){
		table = new HashMap<String, ArrayList<String>>();
		origin = id;
		ancestor = anc;
	}
	
	public Scope(String id){
		table = new HashMap<String, ArrayList<String>>();
		origin = id;
	}
	
	public void addScope(Scope sc){
		innerScopeList.add(sc);
	}

	public void add(String type, ArrayList<Node> arrayListe) {
		ArrayList<String> arrayList = new ArrayList<String>();
		for (Node n : arrayListe){
			arrayList.add(n.getName());
		}
		String name = arrayList.get(0);
		arrayList.set(0, type);
		table.put(name,arrayList);
		
	}

	public void addMethod(String string, Node firstArg) {
		String name = firstArg.getName();
		
		
	}

}
