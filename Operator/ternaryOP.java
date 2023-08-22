package operator;
import java.util.Scanner;

public class ternaryOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		double marks = sc.nextDouble();
		String result = (marks>=50)?"Passed":"Failed";
		System.out.println("You are "+result+" in exam");
		
		// Leap Year using ternary operator
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		String rs = (year%4)==0 && year%100!=0 || year%400==0?"Leap Year":"Not Leap Year";
		System.out.println(year+" is "+rs);

	}

}
