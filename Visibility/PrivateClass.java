package accessModifier;
 class demo{
	 private demo() {
		 System.out.println("This is constructor");
	 }
	 private int num1 = 10;
	 //System.out.println(num1);
	 private static void show()
	 {
		 System.out.println("This is form show method");
	 }
	 
	
}

public class PrivateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo d1 = new demo();// it is throwing error coz private is not accesible outside the class 
		//show();// it is also not accesible evn make it static bocoz method is private 

	}

}
