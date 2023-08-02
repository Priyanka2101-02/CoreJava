package loopClass;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Do while is exit control loop
		 * if the condition false it will print at least ones 
		 * it first execute the block and then exit 
		 */
		int num1 = 1;
	//	int num1=11; /// here condition is false but it shows the output as 11
		do {
			
			System.out.print(num1+"  ");
			num1++;
			
		}while(num1<10);

	}

}
