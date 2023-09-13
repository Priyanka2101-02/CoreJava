package starPattern;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int a[]=new int[3];

		for(int i=0;i<3;i++)

	 {

		a[i]=sc.nextInt();

		 }

		 for(int arr=0;arr<3;arr++)

		 {

		 for(int i=1;i<=a[arr];i++)

		 {

		 for(int j=1;j<=a[arr]-i;j++)

		 {

		 System.out.print(" ");

		 }

		

		 for(int j=1;j<=i;j++)

		 {

		 System.out.print(i+" ");

		 }

		 System.out.println();

		 }

	}
}
}

	



		 

		

		 

		

		 

			

				

		

