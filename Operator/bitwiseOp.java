package operator;

public class bitwiseOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		//Binary value  
		/* 
		  8 4 2 1 
		 0 1 0 1 ---> 5
		 0 0 1 1 ---> 3
		 ------------------
	AND	 0 0 0 1
	OR   0 1 1 1
	XOR  0 1 1 0 
	*/
		 
		
		int x  = 5; // 0101
		int y = 3; //0011
		System.out.println(x&y); // 0010
		System.out.println(x|y); // 0111
		System.out.println(x^y); //0110
		System.out.println(~y); // minus of total positive value which starts from 0
		
		/*
		 *****BITWISE LEFT SHIFT AND RIGHT SHIFT**************
		 */
		int num= 5;
		int num1 = num<<3; // 5*2^3 =40
		int num2 = num>>3; //5/2^3 = 0
		System.out.println(num1);
		System.out.println(num2);
		
		
		

	}

}
