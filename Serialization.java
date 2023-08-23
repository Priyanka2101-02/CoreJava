package file;
import java.io.*;


public class Serialization {

	public static void main(String[] args) {
		Employee e1 =new Employee(101,"Harry","London");
		
		try
		{
			FileOutputStream fos = new FileOutputStream("Emp.txt");
			ObjectOutputStream os =new ObjectOutputStream(fos); //we use object o/p stream because data is in string , int format
			os.writeObject(e1); // Writing object the data in the file
			fos.close();
			os.close();
			System.out.println("Serialized data saved in Emp.txt");
		}catch(Exception e)
		{
		
		}
		

	}

}
