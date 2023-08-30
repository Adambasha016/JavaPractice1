package org.abijeeth.jdbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
public static void main(String[] args) {
	List<Person2> list = new ArrayList<>();
	list.add(new Person2(1,"karthik","kathik@gmail.com"));
	list.add(new Person2(2,"punith","punith@gmail.com"));
	list.add(new Person2(3,"karuna","karuna@gmail.com"));
	list.add(new Person2(4,"mubarak","mubark@gmail.com"));
	list.add(new Person2(5,"thaniya","thaniya@gmail.com"));
	Collections.sort( list,new HelperClass());
	for(Person2 a: list) {
		System.out.println(a);
	}
}
}
