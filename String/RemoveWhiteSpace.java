package string;

public class RemoveWhiteSpace {
public static void main(String[] args)
{
	String str = " Java  developer ";
	for(int i = 0; i<str.length();i++) // Traversing array of character
	{
		char ch = str.charAt(i);// Taking single char 
		if(ch!=' ') //  remove white space 
		{
			System.out.print(ch); // print only string without white space
		}
		
	}
	
}
}
