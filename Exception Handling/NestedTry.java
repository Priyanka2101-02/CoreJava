package exeptionHandling;
/*
 * There can be multiple try and catch block in single class
 * this is called nested try
 */
public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//1st inner try catch
			try
			{
				int num =10/0;
				System.out.println(num);
				
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Number can't divided by zero");
				System.out.println(e);
			}
			//2nd inner try-catch
			try
			{
				int[] arr = {10,20,30,40};
				System.out.println(arr[5]);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		//If the inner block failed to handle the exception outer block will handle the exception
		
		catch(Exception e)
		{
			System.out.println("Handled the outer block exception");;
		}
		System.out.println("Normal Flow!!!");

	}                 

}
