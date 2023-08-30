package org.basic.prg.code.repet.code.repet;

public class WithOutLoopPrint1To10 {
public static void main(String[] args) {
//	 printNumber(1);
	printNumber1(1,10);
}
public static void printNumber(int i) {
	if(i<=10) {
		System.out.println(i);
		printNumber(i+1);
	}
}
public static void printNumber1(int start,int end) {
if(start>end) {
	return;
}
System.out.print(start+" ");
printNumber1(start+1,end);
	
}
}
