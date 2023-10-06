package file;

import java.io.*;

/*write the data using output stream 
 * Read the adata using input stream
 * 
 */

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File f1 =new File("First.txt");// Representing file
		if(f1.exists()) // it will check file is already available or not
		{
			f1.createNewFile();//file creation done here
		}
		FileOutputStream fos=new FileOutputStream(f1);// Writing in the file 
		String str="This is my first file creation";
		fos.write(str.getBytes());// Convert the string into byte i. serialization and write into file
		fos.flush();//remove all data present inside writer
		
	}

}
