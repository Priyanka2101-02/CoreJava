package constructor;
/*
 * If you not create the constructor java will automatically create constructor i.e default constructor
 */
class Hello{
	Hello()
	{
		System.out.println("default contructor!!!");
	}
}
public class NoArgueConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h1 = new Hello();// once initised it will invoked automatically 

	}

}
