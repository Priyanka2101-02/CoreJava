package file;
import java.io.*;
/*
 * if we create file object using abstract path then the path will get same for canonical and absolute
 * if we give the relative path then it will diffrent for absolute and canonical
 	absolute path retuens current location
 	canonical path returns root location 
 */

public class PathDemo {

	public static void main(String[] args) throws IOException {
		//Initialising object and passing as an arguement 
		File f1 =new File("path.txt");//abstract path
		
	boolean	result = f1.createNewFile();// file creation 
	if(result)// it will check file is present or not
	{
		System.out.println("File Created Succesfully "+f1.getCanonicalPath());// it will return the path of file  in string format 
	}
	else
	{
		System.out.println("File Already Existed "+f1.getAbsolutePath());
		System.out.println("File Already Existed "+f1.getCanonicalPath());
		System.out.println("File Already Existed "+f1.getPath()); // Getting relative path
	}
	

	}

}
