package carDistance;

import java.util.Scanner;
/*
Write a program to calculate the distance travelled by car at different time intervals. The initial
velocity of the car is 36 km/hr and the constant acceleration is 5 m/s2.
The formula to calculate distance is:
Distance Travelled = u*t+((a*t*t)/2) where,
u = initial velocity of the car (36 km/hr)
a = acceleration of the car (5 m/s )
t = time duration in seconds
The program should accept 2-time intervals as the input (one-time interval per line) and print the
distance travelled in meters by car (one output per line).
Definitions:
1 kilometer = 1000 meters
1 hour = 3600 seconds
Sample Input
10
 8
Sample Output
350
 240
*/

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
