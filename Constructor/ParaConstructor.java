package constructor;
/*
 * The constructor which takes the parameter or arguements is called parameterized constructor
 */

import java.util.Scanner;

class Add{
	public  Add()// No-ArgueContructor
	{
		System.out.println("This is no arguement contructor");
	}
	Add(int a,int b)// Parameterized constructor 
	{
		int num1 = a;
		int num2=b;
		System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
		
	}
}

public class ParaConstructor {

	public static void main(String[] args) {
		Add a1 = new Add();
		System.out.println("Enter Two Value: ");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Add a2 = new Add(a,b);
		

	}

}
