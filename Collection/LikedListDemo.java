package collection;
import java.util.*;
/*
 * LinkedList elements are caleed node
 * there are three main parts: 1. Reference of previos ele
 * 2.  value of element  
 * 3. Reference of next element 
 * We can insert element at anyside 
 */
//In this program we add, remove and traversing the elements in the linkedlist
//addFirst(), addLast(), removeFirst(), removelast(), getFirst(), getLast()
//peek()--> return the first element poll()---> remove the first element 
public class LikedListDemo {

	public static void main(String[] args) {
		List<String> l1 =new LinkedList<String>();
		l1.add("C Lang");
		l1.add("C++ Lang ");
		l1.add("Java Lang");
		l1.add("Swift Lang");
		l1.add("Python Lang");
		l1.add(".Net Lang");
		l1.add("PHP Lang");
		System.out.println("Before removing elements");
		System.out.println("Language are "+l1);
		l1.add(5,"Javascript");// adding element in specific position
		
		//removing swift language
		l1.remove(3);
		l1.remove("PHP Lang");
		System.out.println("After removing elements");
		Iterator<String> str = l1.iterator();
		while(str.hasNext())
		{
			System.out.println(str.next());
		}
		//geting the element at specific index
		System.out.println("Getting the element of index 3 "+l1.get(3));
		
		//Changing the element at specific index
		l1.set(5, "C# Lang");
		System.out.println(l1);
		
		//Checking the element is present or not  
		System.out.println(l1.contains("C# Lang"));
		
		//Clearing the all the elements
		//l1.clear();
		System.out.println(l1);//it will be null
		
		//Indexof returning the first occurance or last ocurrance 
		System.out.println(l1.indexOf("Java Lang"));
		
		
	}

}
