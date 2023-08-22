package operator;

public class AssignOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 10;
		System.out.println("The value of num1 is: " +num1);
		System.out.println("The value of num2 is: " +num2);
		num1 = num2;
		System.out.println("The value of num1 after assignment : " +num1);
		
		num1+=num2;
		System.out.println("The value of num1 after plus assignment: " +num1);
		System.out.println("The value of num2 after plus assignment: " +num2);
		
		num1-=num2;
		System.out.println("The value of num1 after minus assignment: " +num1);
		System.out.println("The value of num1 after minus assignment: " +num2);
		
		num1*=num2;
		System.out.println("The value of num1 after mul assignment: " +num1);
		System.out.println("The value of num1 after mul assignment: " +num2);
		
		num1/=num2;
		System.out.println("The value of num1 after div assignment: " +num1);
		System.out.println("The value of num1 after div assignment: " +num2);
		
		num1%=num2;
		System.out.println("The value of num1 after modulo assignment: " +num1);
		System.out.println("The value of num1 after modulo assignment: " +num2);
		

	}

}
