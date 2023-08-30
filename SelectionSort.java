package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int []s= {3,4,2,9,6,8,7,1};
		sortSelection(s);
		System.err.println(Arrays.toString(s));
	}
	
	
	
	
	
	
public static void sortSelection(int []m) {
	for(int i=0;i<m.length-1;i++) {
		int index=i;
		for(int j=i+1;j<m.length;j++) {
			if(m[j]<m[index])index=j;
		}
		if(i!=index) {
			int temp=m[i];
			m[i]=m[index];
			m[index]=temp;
		}
	}
}
}
