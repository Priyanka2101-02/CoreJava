package carDistance;

import java.util.Scanner;

class car
{
	void show()
	{
	Scanner sc =new Scanner(System.in);
	int t = sc.nextInt();// first time interval
	int b = sc.nextInt();// 2nd time interval 
	int u = 10;
	int a=5;
	int dist = u*t+((a*t*t)/2);
	int dist1 = u*b+((a*b*b)/2);
	System.out.println(dist);
	System.out.println(dist1);
	}
	
	
	
}

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new car();
		c1.show();

	}

}
