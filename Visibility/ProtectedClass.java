package accessModifier;


public class ProtectedClass {
	protected int num=10;
	protected void show()
	{
		System.out.println("This is from accessmodifier class!!");
		System.out.println(num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProtectedClass p1  = new ProtectedClass();
		p1.show();
				

	}

}
