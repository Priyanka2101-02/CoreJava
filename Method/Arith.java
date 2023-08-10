package method;

public class Arith {
	void disp()
	{
		int num=10;
		int num2= 30;
		System.out.println("Additon of two numbers: "+(num+num2));
	}
	float disp(float num, float num1)
	{
		float a=num;
		float b=num1;
		return(a-b);
		
	}
	double disp(double num, double num1)
	{
		double a=num;
		double b=num1;
		return(a*b);
		
	}
	int disp(int num, int num1)
	{
		int a=num;
		int b=num1;
		return(a/b);
	
	}
	long disp(long num, long num1)
	{
		long a=num;
		long b=num1;
		return a%b;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arith a1= new Arith();
		a1.disp();
		System.out.println("The substraction is "+a1.disp(10f,5f));
		System.out.println("The Multiplication is "+a1.disp(10.5, 5.4));
		System.out.println("The Division is "+a1.disp(14,7));
		System.out.println("The substraction is "+a1.disp(108,50));
		
		

	}

}
