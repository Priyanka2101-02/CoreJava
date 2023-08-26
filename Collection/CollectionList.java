package collection;

import java.util.*;

public class CollectionList {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList();
		str.add("Priyanka");
		str.add("Aishwarya");
		str.add("Anjali");
		str.add("Damini");
		System.out.println("Array size is "+str.size());
		System.out.println("String Elements are "+str);
		/*
		 * Iterator method is used for traversing an element 
		 * normally we can print an element and i=using this method we can also traverse list
		 * hasNext() return true if there is element in list otherwise retuen false 
		 * after printing the element next() it  is moving to the next element 
		 */
		Iterator <String> itr = str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
