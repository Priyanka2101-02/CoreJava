package file;
import java.io.*;
public class ReadingFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fip = new FileInputStream("First.txt");
		int i=fip.read(); // deserialize and reading the data 
		while(i!=-1) {
			System.out.print((char)i); // converting int into char
			i=fip.read();	//traverse the content in the file
			}
		fip.close();
		
	}

}
