package collection;
/*
 * TreeMap follows the ascending order
 */

import java.util.*;

public class Treemap {

	public static void main(String[] args) {
		NavigableMap<Integer, String> nm=new TreeMap<>();
		nm.put(101, "Mango");
		nm.put(104, "Banana");
		nm.put(102, "Orange");
		nm.put(100, "Kiwi");
		System.out.println(nm);
		
		System.out.println("Key are"+nm.keySet());
		System.out.println("Decending Order "+nm.descendingMap());
		
		System.out.println("Headmap"+nm.headMap(104, true));
		System.out.println("Headmap"+nm.headMap(104, false));
		
		System.out.println("Tailmap"+nm.tailMap(102,true));
		System.out.println("Tailmap"+nm.tailMap(102,false));
		
		System.out.println("n between"+nm.subMap(101,104));
		System.out.println("n between"+nm.subMap(101,true,104,true));
		
		
	}

}
