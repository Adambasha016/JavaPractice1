package org.demo.jdbc.practice;

public class Demo {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver class loaded ");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
