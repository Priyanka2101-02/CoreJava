package collection;

import java.util.*;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> s= new Stack();
		System.out.println("How many value you want to add");
		Scanner ip =new Scanner(System.in);
		int s1 = ip.nextInt();
		
		for(int i=0;i<s1;i++)
		{
			s.add(i);
		}
		System.out.println("The values are "+s);
		

	}

}
