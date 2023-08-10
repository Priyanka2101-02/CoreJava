package method;

public class Function {
void main()
{
	System.out.println("Doen't retuen anything!!!");
	
}
int main(int a, int b)
{
	int num, num1;
	num=a;
	num1=b;
	
	return num+num1;
}
String main(String str)
{	String str1=str;

	
	return str1;
}
float main(float len, float bre)
{
	float l = len;
	float b= bre;
	
	return l*b;
}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Function f1 = new Function();
			f1.main();
			System.out.println("The String is "+f1.main("Hello"));
			System.out.println("Area of rectangle is"+f1.main(7.8f,9.5f));
			System.out.println("Addition of number is "+f1.main(10,30));
			
					

	}

}
