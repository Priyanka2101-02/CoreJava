package myPackage;
class Subject{
	//instance Variable access anywhere in the program 
	int Marathi;
	int Hindi;
	int English;
}
public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s1 = new Subject();
		s1.Marathi = 78;
		s1.Hindi = 80;
		s1.English = 90;
		System.out.println("The Marks of S1 Object is: "+s1.English+" "+s1.Hindi+" "+s1.Marathi);
		
		Subject s2 = new Subject();
		s2.Marathi = 60;
		s2.Hindi = 85;
		s2.English = 78;
		System.out.println("The Marks of S2 Object is: "+s2.English+" "+s2.Hindi+" "+s2.Marathi);
		
		

	}

}
