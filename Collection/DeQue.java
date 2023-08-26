package collection;

import java.util.*;

/*
 * 
 */
class Stud
{
	int id; String name; int age;
	public Stud(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
}

public class DeQue {

	public static void main(String[] args) {
		Deque <Stud> d=new ArrayDeque<Stud>();
		Stud s1=new Stud(101,"Harry",21);
		Stud s2=new Stud(102,"Ron",22);
		Stud s3=new Stud(103,"Longbottom",20);
		d.add(s1);
		d.add(s2);
		d.add(s3);
		//traversin an array using for each
		for(Stud s: d)
		{
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		
	}
	

}
