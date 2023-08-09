package controlFLowStatement;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The number");
		int num1= sc.nextInt();
		if(num1>0)
		{
			System.out.println("Number is Positive!!!!");
			
		}
		else
		{
			System.out.println("Number is Negative!!!!!");
		}
	}

}
