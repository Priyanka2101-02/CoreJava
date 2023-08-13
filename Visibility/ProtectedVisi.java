package visibility;
import accessModifier.*;
/*
 * Protected can access outside the class only in child class 
 * here we extends method to get all parent class proprties 
 */
public class ProtectedVisi extends ProtectedClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedVisi pv =new ProtectedVisi();
		pv.show();

	}

}
