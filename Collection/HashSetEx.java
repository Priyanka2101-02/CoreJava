package collection;
/*
 * it doesn't contain duplicate values 
 * it printing randomly data 
 * 
 */
import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(10);
		s.add(11);
		s.add(40);
		s.add(10);
		System.out.println(s);
		s.remove(11);
		System.out.println(s);
		s.add(100);
		System.out.println(s);
		
		
		
	}

}
