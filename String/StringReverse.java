package string;

public class StringReverse {
	

	public static void main(String[] args) {
		String rev="";
		String str = "Java Developer";
		char ch[] = str.toCharArray(); //Convert string into char array
		for(int i=ch.length-1;i>=0;i--)// Traverse the string in reverse order
		{
			if(ch[i]!=' ') //removing white space 
			{
			rev= rev+ch[i]; // adding char one by one 
			}
		}
		System.out.println("After Reverse String "+rev); // print
		
	}

}
