package exeptionHandling;
/*
 * throw i used to through single exception at time
 * throw is used to for checked and unchecked exception 
 * 
 */

public class Throw {
	public static void findFile()
	{
		throw new ArithmeticException("File not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			findFile();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Check the try block code");
		}

	}

}
