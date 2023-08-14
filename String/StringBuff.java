package string;

public class StringBuff {

	public static void main(String[] args) {
		/*
		 * String Buffer is way to make string mutable
		 * String buffer is used for multi thread application
		 * It is slower than String Builder 
		 */
		StringBuffer str = new StringBuffer("Wlcome to Java");
		System.out.println(str);
		System.out.println(str.insert(1, 'e')); // It will insert char at index 1
		System.out.println(str.append(" World")); //  append method add string at the end of the original string 
		System.out.println(str.replace(8, 10,"in")); // Replace method change the string to particular string
		System.out.println(str.delete(16,21)); // it will delete string from start index to end index
		System.out.println(str.reverse()); // Reverse the string 
		
	}

}
