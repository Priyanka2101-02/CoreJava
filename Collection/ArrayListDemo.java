package collection;
import java.util.*;
/*
 * it can take heterogenous structure 
 * It allows duplicate value 
 *we can add generics to restrict only take int, string etc
 *instead of collection we can use List or LinkedList, Stack, Vector ArrayList
 *
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList();
		num.add(10);
		num.add(10);
		num.add(50);
		//num.add("Pen");
		//num.add('P');
		System.out.println(num);
		for(int n: num)
		{
			System.out.println(num);
		}

	}

}
