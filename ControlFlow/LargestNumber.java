package controlFLowStatement;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		double num1, num2, num3;
		System.out.println("Enter the three value !!");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		//double num1 = -1.5, num2 = 5.6, num3 = 8.4;
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Num1 is largest number!!"+"\n"+"The value of Num1 is "+num1);
			}
			else
			{
				System.out.println("Num3 is largest number!!"+"\n"+"The value of Num3 is "+num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Num2 is largest number!!"+"\n"+"The value of Num2 is "+num2);
			}
			else
			{
				System.out.println("Num3 is largest number!!"+"\n"+"The value of Num3 is "+num3);
			}
		}

	}

}
