package controlFLowStatement;

import java.util.Scanner;

public class SwitchClass {

	public static void main(String[] args) {
		System.out.println("Number Points to day!!!!!!");
		System.out.println("Enter your Choice!!");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		switch(no)
		{
		
		case 1:
			System.out.println("This is Monday!!");
			break;
		case 2:
			System.out.println("This is Tuesday!!");
			break;
		case 3:
			System.out.println("This is Wedneday!!");
			break;
		case 4:
			System.out.println("This is Thursday!!");
			break;
		case 5:
			System.out.println("This is Friday!!");
			break;
		case 6:
			System.out.println("This is Saturday!!");
			break;
		case 7:
			System.out.println("This is Sunday!!");
			break;
			default:
				System.out.println("Enter Valid choice!!!!");
		}
		
		

	}

}
