package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int a[]= {2,4,6,8,10,12,14};
		revese(a);
		System.out.println(Arrays.toString(a));
	}
	
	
public static void revese(int []a) {
	int i=0,j=a.length-1;
	while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
}
}
