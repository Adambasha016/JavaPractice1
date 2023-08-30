package org.basic.prg.code.repet.code;

import java.util.ArrayList;

public class SubArray {
//	static ArrayList<Integer> az=new ArrayList<>();
			
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		subArray(a);}
	
public static void subArray(int []a) {
	for(int i=0;i<a.length;i++) {
		for(int j=i;j<a.length;j++) {
			for(int k=i;k<=j;k++) {
				if(k==i)System.out.print("[");
				System.out.print(a[k]);
//				az.add(a[k]);
				if(k<j)System.out.print(",");
			}
			System.out.print("]");
			System.out.print(" ");
		}
	}
//	System.out.println(az);
}
}
