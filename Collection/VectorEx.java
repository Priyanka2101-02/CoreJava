package collection;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		Vector <String> str = new Vector();
		System.out.println("Collection of Shoes");
		str.add("Adidas");
		str.add("Puma");
		str.add("Campus");
		str.add("Bata");
		str.add("Nike");
		System.out.println("First Way to print");
		//First way to print 
		System.out.println(str);
		//second way to print
		System.out.println("Seond Way to print");
		for(String s:str)
		{
			System.out.println(s);
		}
		//Third way to print
		System.out.println("Third Way to print");
		Iterator<String>itr=str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		

	}

}
