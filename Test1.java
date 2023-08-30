package org.abijeeth.jdbc;

import org.abijeeth.jdbc.OuterClass.InnerClass;

public class Test1 {
public static void main(String[] args) {
	OuterClass.outer();
	System.out.println(OuterClass.massage);
	OuterClass.InnerClass.inn();
	OuterClass.InnerClass class1 = new OuterClass.InnerClass();
	class1.nonStatic();
}
}
