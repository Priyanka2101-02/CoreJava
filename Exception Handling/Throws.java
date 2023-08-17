package exeptionHandling;
/*
 * Throws keyword is used to declared multiple exception 
 * throws is used to declare exception in method
 * it is checked exception
 */
public class Throws {
	//Declared multiple exception using throws keyword 
	public static void calc()throws ArithmeticException, ArrayIndexOutOfBoundsException
	{
		//This block of code that may raise an exception 
		
		//int num =0/0;
		//System.out.println(num);
		
		int[] arr= {10,20,30,40};
		System.out.println(arr[4]);
		
		
	}

	public static void main(String[] args) {
		try
		{
			calc();

		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception is thrown!!");
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is out of bounds exception");
			System.out.println(e);
			
		}

	}

}
