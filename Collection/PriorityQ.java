package collection;
import java.util.*;
/*
 * The elements will print depends on priority
 * every elements in priority queue have comparable, it will delete higher priority
 */

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Q");
		pq.add("Z");
		pq.add("C");
		pq.add("P");
		pq.add("A");
		System.out.println("Elements in Queue "+pq);
		
		System.out.println("Removing the element "+pq.remove());
		
		System.out.println("Elements in Queue "+pq);

	}

}
