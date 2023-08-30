package org.abijeeth.jdbc;
interface Abc{
	void m1();
void m3();	
}
abstract class xyz{
	abstract void m2();
	
}
public class Demo054 {
public static void main(String[] args) {
	Abc t= new Abc() {
		
		@Override
		public void m3() {
System.out.println("interface m3");			
		}
		
		@Override
		public void m1() {
System.out.println("interface m1");			
		}
	};
	t.m1();
	t.m3();
	xyz xyz = new xyz() {
		
		@Override
		void m2() {
System.out.println("abstact m2");			
		}
	};
	xyz.m2();
}
}     