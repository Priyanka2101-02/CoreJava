package collection;
/*
 * Map implementation using Hashmap
 * ma<key,value>
 */

import java.util.*;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> eve=new HashMap<>();
		eve.put("First",20);
		eve.put("Second",10);
		eve.put("Third",40);
		eve.put("Fourth",50);
		System.out.println("Map Elelemnts are"+eve);
		//accessing the key from the mao
		System.out.println("map keys are "+eve.keySet());
		
		//Accesing the values from the map
		System.out.println("Map Values are "+eve.values());
		
		//Accessin the entries on the map
		System.out.println("map keys are "+eve.entrySet());
		
		//Removing elemnts from the map
		System.out.println("After removing the value "+eve.remove("Fourth"));
		
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "Harry");
		m.put(2, "Ron");
		m.put(3, "Navel");
		m.put(4, "Chris");
		m.put(5, "Rosy");
		
		System.out.println("values are "+m);
		System.out.println("Key elements "+m.keySet());
		System.out.println("values are "+m.values());
		
		
		
		
	}

}
