package file;
import java.io.*;

public class Deserialization {

	public static void main(String[] args) {
		Employee e1=null;
		try
		{
			FileInputStream fis= new FileInputStream("Emp.txt");
			ObjectInputStream ois =new ObjectInputStream(fis);
			e1=(Employee)ois.readObject();// reading the object from employee class 
			ois.close();
			fis.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
		System.out.println("Deserilization is done successfully in Emp.txt");
		System.out.println("ID: "+e1.id +" NAME: "+e1.name +" ADDRESS: "+e1.adr);

	}

}
