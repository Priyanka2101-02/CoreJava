package inheritance;

import java.util.Scanner;

class Base
{
	 int num,num1;
		void show() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two value: ");
		 num = sc.nextInt();
		 num1= sc.nextInt();
		}

}
class Add extends Base
{
	void display()
	{
		System.out.println("Addition of numbers is: "+(num+num1));
	}
}
/*
 * Here in both class Add and Mul method name is same but it is not throwing error becoz both class not extending the properties
 * It is only called method redeclaration. 
 */
class Mul extends Base
{
	void display()
	{
		System.out.println("Multiplication of numbers is: "+(num*num1));
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mul m1 = new Mul();
		m1.show();
		m1.display();
		System.out.println("Num "+m1.num+" "+" Num1 "+m1.num1);

		
		
		Add a1 = new Add();
		a1.show();
		a1.display();
		System.out.println("Num "+a1.num+" "+" Num1 "+a1.num1);
		
	}

}
