package org.abijeeth.jdbc;

public class Test2 {
public static void main(String[] args) {
//	Comparable<Person> ad = new Person();
//	ad.compareTo(o)
	
	Circle q=new Circle(30);
	Circle q1=new Circle(30);
	//Circle q2=new Circle(90);
	int to = q.compareTo(q1);
	System.out.println(to);
	if(to>0) {
		System.out.println("q is bigger then q1");
	}
	else if (to<0) {
		System.out.println("q1 is bigger then q");
		
	}
	else { System.out.println("both are eqal");
}
}
}

 