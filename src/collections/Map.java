package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		 LinkedHashMap<Integer, String > x = new LinkedHashMap<>();
		
		x.put(10,"java");
		x.put(20, "sql");
		x.put(10, "c");
		x.put(30, "Tableau");
		
		int A = x.size();
		System.out.println(A);
		
		boolean b = x.containsKey(20);
		System.out.println(b);
		
		boolean c = x.containsValue("java");
		System.out.println(c);
		
		String d = x.get(10);
		System.out.println(d);
		
		Collection<String> E = x.values();
		System.out.println(E);
		for (String F : E) {
			System.out.println(F);
		}
		
		Set<Entry<Integer, String>> G = x.entrySet();
		for (Entry<Integer, String> entry : G) {
			System.out.println(G);
			Integer key = entry.getKey();
			String val = entry.getValue();
			
		}
		

	}

}
