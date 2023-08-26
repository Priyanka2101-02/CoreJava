package collection;
import java.util.*;

/*
 * Data structure works in FIFO manner 
 * Front end for deletion 
 * Rear end for adding object
 * offer()--> Add the element on sorting order 
 * 
 */
public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		//Adding the elements
		for(int i=0;i<5;i++)
		{
			q.add(i*2);
		}
		//Display the ele
		System.out.println(q);
		System.out.println("Removed element "+q.remove());
		
		Iterator<Integer> itr=q.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//getting head ele
		System.out.println("Head element is "+q.peek());
		
		//Removing first head ele
		System.out.println("Removing first element is "+q.poll());
		
		//Adding last ele
		System.out.println("Adding element  "+q.offer(5));
		
		//Display the updated ele
		System.out.println(q);
		
		//Size the updated queue
		System.out.println("Size of updated queue is "+q.size());
		

	}

}
