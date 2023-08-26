package collection;
/*
 * used  for multithreading applications, Synchronize, thread safety
 */

import java.util.*;

public class VectorClass {

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		v.add("cat");
		v.add("Dog");
		v.add("Cow");
		System.out.println("the mammals");
		System.out.println(v);
		
		Vector<String> ani = new Vector<String>();
		ani.addAll(v); //addAll is used to add two vectors
		ani.add("Lion");
		ani.add("Panda");
		
		System.out.println("Updated Animals");
		System.out.println(ani);

	}

}
