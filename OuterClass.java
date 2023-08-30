package org.abijeeth.jdbc;

public class OuterClass {
static String massage="massage from ouetr calss";
public static void outer() {
	System.out.println("outer() in outer class");
}
public static  class InnerClass{
	public static void inn() {
		System.out.println("inn() from inner class");
	}
	public void nonStatic() {
		System.out.println("non static inner class");
	}
}

}
