package operator;

public class relationalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <,>,<=,>=,==,!= 
	int num1 = 10;
	int num2 = 20;
	boolean val = num1>num2;
	boolean val1 = num1<num2;
	System.out.println(val);
	System.out.println(val1);
	if(num1!=num2) {
		System.out.println("Not equal");}
	else {
		System.out.println("Equal");
	}
	int num3 = 20;
	if(num2==num3)
	{
		System.out.println("Equal!!");
	}else {
		System.out.println("not equal!!");
	}
	int marks = 75;
	if(marks>=75)
	{
		System.out.println("Distinction!!");
	}
	if(marks<=75)
	{
		System.out.println("First Clas");
	}
	
	

	}

}
