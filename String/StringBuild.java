package string;

public class StringBuild {

	public static void main(String[] args) {
		/*
		 * 
		 * String Builder is way to make string mutable
		 * String builder is used for single thread application
		 * It is faster than String Builder 
		 */
		StringBuffer str = new StringBuffer("Helo Folks!");
		System.out.println(str);
		System.out.println(str.insert(2, 'l'));
		System.out.println(str.append(" I'm priyanka"));
		System.out.println(str.replace(5, 11," everyone"));
		System.out.println(str.delete(16,28));
		System.out.println(str.reverse());
		 

	}

}
