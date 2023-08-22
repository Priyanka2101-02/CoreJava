package operator;
import java.util.*;
class calc{
	void add() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int num1= sc.nextInt();
		System.out.println("Enter the second value: ");
		int num2= sc.nextInt();
		System.out.println("Addtion is: "+(num1+num2));
		
	}
	void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int num1= sc.nextInt();
		System.out.println("Enter the second value: ");
		int num2= sc.nextInt();
		System.out.println("Substraction is: "+(num1-num2));
		
	}
	void mul() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int num1= sc.nextInt();
		System.out.println("Enter the second value: ");
		int num2= sc.nextInt();
		System.out.println("Multiplication is: "+(num1*num2));
	}
	void div() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int num1= sc.nextInt();
		System.out.println("Enter the second value: ");
		int num2= sc.nextInt();
		System.out.println("Division is: "+(num1/num2));
	}
	void mod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int num1= sc.nextInt();
		System.out.println("Enter the second value: ");
		int num2= sc.nextInt();
		System.out.println("Modolu is: "+(num1%num2));
	}
		
	

}

public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calc s1 = new calc();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
		s1.mod();
		
		
		

	}

}
