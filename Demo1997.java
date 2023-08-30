package org.abijeeth.jdbc;

import java.util.Arrays;
import java.util.Collections;

public class Demo1997 {
	public static void main(String[] args) {
		String s1="banana";
		char[] cs = s1.toCharArray();
//Collections.sort(s1,new DEmo1996());		
		

//		Arrays.sort(cs);
		for(int i=0;i<cs.length;i++) {
			for(int j=i+1;j<cs.length;j++) {
				
			if(cs[i]>cs[j]) {
				char temp=cs[i];
				cs[i]=cs[j];
                cs[j]=temp;


			}
		}
	
		}
		System.out.println(Arrays.toString(cs));

}
}