package method;

public class Overloading {
	double area(double rad)
	{
		return 3.17*rad*rad;
	}
	double area(double len, double bre)
	{
		return len*bre;
	}
	double area(double len, double bre, double hei)
	{
		return (len*bre*hei)/2;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o1 =new Overloading();
		System.out.println("Area of Circle is "+o1.area(5.4));
		System.out.println("Area of Rectangle is "+o1.area(6.1,4.2));
		System.out.println("Area of Rectangle is "+o1.area(2.1,1.2,3.2));
		

	}

}
