package org.basic.prg.code.repet.code.repet;

public class SumOfElementInArray {

	public static void main(String[] args) {
		int as[]= {1,2,3,4,5};
		System.out.println(sumofElement(as, 0));
	}
	
	
	
	
	
	
	
	static int sumofElement(int []ar,int i) {
		if(i==ar.length) {
			return 0;
		}
		return sumofElement(ar, i+1)+ar[i];
	}
	
	
	
	
	
	
}
