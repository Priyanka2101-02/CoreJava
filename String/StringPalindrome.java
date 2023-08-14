package string;

public class StringPalindrome {

	public static void main(String[] args) {
		String rev="";
	 String str = "Madam";
	 char ch[] = str.toCharArray(); // convert string into char array
	 for(int i = ch.length-1;i>=0;i--) // traverse in reverse order
	 {
		 rev = rev+ch[i];
	 }
	 System.out.println(rev);
	 if(rev.equals(str)) //checking for palindrome
	 {
		 System.out.println("String is Palindrom!!");
	 }
	 else {
		 System.out.println("String is not Palindrome!!!");
	 }
	 

	}

}
