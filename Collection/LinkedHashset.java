package collection;

import java.util.*;

public class LinkedHashset {

	public static void main(String[] args) {
		Set<Integer> s1= new LinkedHashSet<>();
		s1.add(10);
		s1.add(1);
		s1.add(5);
		s1.add(60);
		System.out.println(s1);
		s1.remove(5);
		System.out.println(s1);
		s1.add(25);
		System.out.println(s1);
	}

}
