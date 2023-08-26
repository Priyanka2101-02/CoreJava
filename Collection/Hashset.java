package collection;

import java.util.*;

class demo
{
	String pet;
	double wei;
	int age;
	public demo(String pet, double wei, int age)
	{
		this.pet=pet;
		this.wei=wei;
		this.age=age;
	}
}

public class Hashset {

	public static void main(String[] args) {
		Set<demo> d1=new HashSet<>();
		demo s1= new demo("cat",5.6,10);
		demo s2= new demo("dog",10,21);
		demo s3= new demo("Cow",100.65,56);
		demo s4= new demo("Hen",2.3,1);
		
		d1.add(s1);
		d1.add(s2);
		d1.add(s3);
		d1.add(s4);
		
		for(demo de:d1)
		{
			System.out.println("Pet Name:  "+de.pet+"  Pet weight:  "+de.wei+"  Pet age:  "+de.age);
		}
		

	}

}
