package exeptionHandling;

public class VoterValid {
	static void Valid(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Voter is not valid");
		}
		else
		{
			System.out.println("Voter is valid!!");
		}
	}

	public static void main(String[] args) {
		Valid(18);
		
		

	}

}
