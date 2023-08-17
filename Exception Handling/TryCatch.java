package exeptionHandling;
/*
 * Exception is an unwanted error that inturrupt normal flow 
 * of a program 
 * Two type: 1. checked 2. unechecked 
 * try block is cannot be alone it has catch block associated with it
 * 
 */

public class TryCatch {

	public static void main(String[] args) {
		/*
		 * Without try and ctach block it will throw an error 
		 */
		try// critical section that may cause the exception 
		{
			int[] arr = {10,20,30,40};
			System.out.println(arr[4]);
			
		}
		
		catch(Exception e)// handle the exception 
		{
			System.out.println("Something went wrong!!");
			System.out.println(e);
			
		}
		

	}
}