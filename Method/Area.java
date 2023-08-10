package method;

class Shape{
	double side=12.5, len=1.2, bre=8.5, rad=5.1, hei=15.0, br=8;
	
	
}
class Sqaure extends Shape
{
	void area()
	{
		System.out.println("Area of Square is "+(side*side));
	}
}
class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Area of Rectangle is "+(len*bre));
	}
}
class Circle extends Shape
{
	void area()
	{
		
		System.out.println("Area of Circle is "+(3.17*rad*rad));
	}
}
class Triangle extends Shape
{
	
	void area()
	{
		
		System.out.println("Area of Triangle  is "+(hei*br)/2);
	}
} 


public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.area();
		Rectangle r1 = new Rectangle();
		r1.area();
		Sqaure s1 = new Sqaure();
		s1.area();
		Triangle t1 =new Triangle();
		t1.area();

	}

}
