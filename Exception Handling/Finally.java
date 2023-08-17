package exeptionHandling;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		for(int i=5;i>=0;i--)
		try
		{
			System.out.println(a/i);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());

		}
		finally
		{
			System.out.println("This is finally block this will excevute whether exception is handled or not");
		}
		

	}

}
