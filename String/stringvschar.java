package string;

public class stringvschar {

	public static void main(String[] args) {
	/*
	 * Difference between Char and String
	 * -> char is used for single character 
	 * -> it is primitive data type
	 * -> char is mutable 
	 * -> char used variable 
	 * 
	 * -> String is user defined class and it is no-primitive data type
	 * -> string immutable
	 * -> string create object to print the data
	 * -> string is collection of character array
	 * 
	 */
		
		
		
		
		//We can define character array in that way
		char[] a,c = {'c','a','t'}; // both a and c are array of character 
		char []b = { 'A'}; // this way to declare array char
		char d[]= {'Z'};// normal way
		System.out.println(d[0]);
		System.out.println(b[0]);
		for(int i = 0;i<c.length;i++) {
		System.out.print(c[i]);

		}
		System.out.println();
		
		String str = "Hello World"; //literal way
		System.out.println(str);
		
		String str1 = new String("java developer"); // using new keyword
		System.out.println(str1);
		
		
		
		
		
		

	}

}
