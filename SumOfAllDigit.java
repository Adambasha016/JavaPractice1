package org.basic.prg.code.repet.code.repet;

public class SumOfAllDigit {
	
	public static void main(String[] args) {
		System.out.println(sumOfAllDigit(18));
	}
   static int sumOfAllDigit(int n) {
	   if(n==0) {
		   return 0;
	   }
	   return sumOfAllDigit(n/10)+n%10;
   }
}
