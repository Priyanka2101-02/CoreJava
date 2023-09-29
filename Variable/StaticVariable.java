package variables;

public class StaticVariable {
	static String name = "Harry Potter"; //static variable 
	String str = "Iven Jon"; //instance variable 
	
	// we can access static variable and instance variable globally 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static Variable: "+name); // No need to create an object for static variable. 
		//System.out.println("Instance Variable: "+str);// error while running 
		StaticVariable s1 = new StaticVariable();
		System.out.println("Instance Variable: "+s1.str);
	}

}
