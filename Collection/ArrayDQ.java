package collection;

import java.util.*;

public class ArrayDQ {

	public static void main(String[] args) {
		Deque <String> d= new ArrayDeque<String>();
		d.add("dell");
		d.add("HP");
		d.add("Asus");
		d.add("MacOS");
		
		for(String str:d)
		{
			System.out.println(str);
		}
		d.offer("CD");
		System.out.println(d);
		
		d.offerFirst("Andriod");
		System.out.println(d);
		
		d.offerLast("Nokia");
		System.out.println(d);
		
		d.pollFirst();
		System.out.println(d);
		
		d.pollLast();
		System.out.println(d);
		
		
	}
}
