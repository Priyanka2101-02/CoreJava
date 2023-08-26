package collection;
/*
 * sortedset is used to print an element in sorting 
 * order 
 * to implement sorted set we have to declare Treeset
 */
import java.util.*;

public class sortedset {

	public static void main(String[] args) {
		SortedSet<Integer> ss=new TreeSet<>();
		ss.add(10);
		ss.add(23);
		ss.add(0);
		ss.add(8);
		ss.add(2);
		ss.add(15);
		System.out.println(ss);
		
		SortedSet<Integer> s=new TreeSet<>();
		s.add(100);
		s.add(1);
		s.add(9);
		s.addAll(ss);
		System.out.println(s);
		
		
		System.out.println("First Element "+s.first());
		System.out.println("Last Element "+s.last());
		s.removeAll(s);
		System.out.println(ss);
		System.out.println(ss.subSet(0, 10));
		System.out.println(ss.tailSet(8));// return the ele from 8
		System.out.println(ss.headSet(2));//return the ele previous from the 2
	}

}
