import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Problem 2 : English Maths CODING SCORE: 100
Problem Statement
You are given two integers in the form of strings, your job is to multiply them and then return the
resultant integer as a string.
Input Format
• The first line is the first string.
• The second line is the second string.
Constraints
• The length of the first string : A : 1<=|A|<=200 .
• The length of the second string : B : 1<=|B|<=200
Output Format
• The output should be a string, representing the output of the multiplication of the 2 integers
represented by A and B.
Evaluation Parameters
• Sample Input
• Sample Output
• Explanation
The multiplication of the two string "5" and " 5" is "25".
i/p
5
5
o/p
25

 
 */
 class story
{
	public static String Mul(String num, String num2)
	{
		BigInteger val1=new BigInteger(num);
		BigInteger val2=new BigInteger(num2);
		BigInteger product=val1.multiply(val2);
		String res= product.toString();
		
		
		return res;
	}
}
public class Multiply {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num=br.readLine();
		String num2= br.readLine();
		String res= story.Mul(num,num2);
		System.out.println(res);
		
		
		
	}

	

}
