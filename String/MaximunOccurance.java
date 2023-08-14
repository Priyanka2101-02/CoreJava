package string;

public class MaximunOccurance {
// Finding out maximum occurrence of 'e' in given string
	public static void main(String[] args) {
		String str = "Java Developer";
		int count = 0;
		for(int i=0; i<str.length(); i++) // Traverse the string 
		{
			if(str.charAt(i)=='e')// checking for occurrence 
			{
				count++; // increase the count
			}
		}
		System.out.println("Maximum occurance in "+str+" is "+count);// print the count 
		
	}

}
