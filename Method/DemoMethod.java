package method;
import java.util.Scanner;

class StudentData{
	int id;
	String name;
	int s1,s2,s3,s4;
	float avg;
	char grade;
	
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of Student: ");
		id=sc.nextInt();
		
		System.out.println("Enter name of Student: ");
		name=sc.next();
		
		System.out.println("Enter marks of Student: ");
		s1=sc.nextInt();s2=sc.nextInt();s3=sc.nextInt();s4=sc.nextInt();
		avg = (s1+s2+s3+s4)/5;
		
		System.out.println("Enter grade of Student: ");
		grade=sc.next().charAt(0);
	}
		
		 void display()
		{
			 System.out.println("Student ID: "+id);
			 System.out.println("Student name: "+name);
			 System.out.println("Student marks: "+s1+" "+s2+" "+s3+" "+s4);
			 System.out.println("Student marks avarage "+avg);
			 System.out.println("Student grade: "+grade);
			 	 	
		}	
		
}
public class DemoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentData st = new StudentData();
		st.getdata();
		st.display();
	}

}
