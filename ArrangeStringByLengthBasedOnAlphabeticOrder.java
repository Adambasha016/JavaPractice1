package org.abijeeth.jdbc;

import java.util.Arrays;

public class ArrangeStringByLengthBasedOnAlphabeticOrder {
public static void main(String[] args) {
	String s1="java  an general purpose b ab language and is a easy to understaed by humans";
	String[] split = s1.split(" ");
	Arrays.sort(split);
//for(String s :split) {
	//System.out.println(s+" ");
//}
	for(int i=0;i<split.length;i++) {
		for(int j=i+1;j<split.length;j++) {
			int fi=split[i].length();
			int se=split[j].length();
		
			if(fi!=se&&fi>se) {
			String temp=split[i];
			split[i]=split[j];
			split[j]=temp;
			}
		}
	}
	for(String s :split) {
		System.out.print(s+" ");
		
	}

	
}

}

