package file;
import java.io.*;
/*
 * Data is not readable beacause in serialization string is converted into byte streams
 */

public class Employee implements Serializable{
	String name, adr;
	int id;
	Employee(int id,String nm,String ad)
	{
		this.name=nm;
		this.adr=ad;
		this.id=id;
	}

}
