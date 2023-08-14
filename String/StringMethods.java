package string;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String str1 = "Java Developer";
		String str2 = "    Hello";
		
		//join two strings
		System.out.println("First Way: "+str+str1);
		System.out.println("Seconds Way: "+(str.concat(str1)));
		//find length
		System.out.println("Length of String 2: "+str1.length());
		//lowecase
		System.out.println("String in lower case: "+str1.toLowerCase());
		//uppercase
		System.out.println("String in upper case: "+str1.toUpperCase());
		//trim remove unwanted leading spaces 
		System.out.println("Before trim: "+str2);
		System.out.println("After trim: "+str2.trim());
		// Strts with or not 
		System.out.println("Starting with Ja: "+str1.startsWith("ja"));
		System.out.println("Starting with Ja: "+str1.startsWith("Ja"));
		// Charater at index 
		System.out.println("Character at index 2: "+str1.charAt(2));
		//Replace String 
		String rep= str1.replace("Java", "Software");
		System.out.println("Replace java with software: "+rep);
		
		//The Contains() method is used to determine whether a string contains a specific substring.
		System.out.println("Strings contains loper "+str1.contains("loper"));
		
		//The StartsWith() method is used to determine whether a string starts with a specific substring.
		System.out.println("String starts with Hell: "+str.startsWith("Hell"));
		
		//The EndsWith() method is used to determine whether a string ends with a specific substring.
		System.out.println("String Ends with lo: "+str.endsWith("lo"));
		
		//The Substring() method is used to extract a portion of a string based on a specified starting index and length.
		System.out.println("Substring from iindex 1 with lenght 5 is: "+str1.substring(1,5));
		 
		//The Split() method is used to split a string into an array of substrings based on a specified separator.
		String str4 = new String("Welcome Java");
		String[] res = str4.split("#");
		System.out.println("After splitting: "+res);
		System.out.println(Arrays.toString(res));
		
		
		//intern share all strings having the same content share the same memory.
		System.out.println("After inserting substring: "+str.intern());
		/*
		 *  Diffrence between equals and ==
		 * == method checks for memory location
		 *  eqauls method checks only value 
		 *  
		 */
		
		String str3 = new String("Hello");
		System.out.println("String Equals and not equals!!"+str.equals(str1));
		System.out.println(str==str2);// 
		System.out.println(str==str3);// it is returning false coz == checks for memory location of object 
		 
		
		// Values of
		System.out.println("Values of str: "+str.valueOf(str));
		
		
		
		
		
				

	}

}
