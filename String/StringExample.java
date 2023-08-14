package string;
/*
 * Sarah is planning to spend a week at her friend’s summer house in Amsterdam. Sarah is not sure if
her father will allow her to go with the friends. However, Sarah went to her father and ask for his
permission. Sarah's father works at DoSelect as a Programmer. He came to Sarah with one
condition, he wants Sarah to code something related to "AMSTERDAM" and if she does it correctly,
she will be allowed to go.
Sarah's father gave a string and wants her to write a function that returns the number of times "am"
appears in the String ignoring the case
Sarah is not so good at programming and needs your help.
Your task here is to implement a Java code based on the following specifications. Note that your
code should match the specifications in a precise manner. Consider default visibility of classes,
data fields and methods are public unless mentioned otherwise.
Specifications
Task:
class InAmsterdam
Implement the below method for this class:
• int countAm(String str): return the number of times "am" appears in the String
ignoring the case
Sample Input
Sample Output
NOTE
• You can make suitable function calls and use the RUN CODE button to check your main()

 */

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toLowerCase();
		//char[] arr = str.toCharArray();
		for(int i=0; i<str.length()-1;i++)
		{
			if(str.charAt(i)=='a' && str.charAt(i+1)=='m')
			{
				count++;
			}
			
		}
		System.out.println("The count Am in String is: ");
		System.out.println(count);
		
		

	}

}
