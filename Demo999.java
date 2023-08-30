package org.abijeeth.jdbc;

import java.util.Arrays;
import java.util.Scanner;

public class Demo999 {
public static void main(String[] args) {
	
	String [] as= {"10","20","30","40","49","45","35","25","87","29"};
	String []e=new String[as.length];
	for(int  i=0;i<as.length;i++) {
		int int1 = Integer.parseInt(as[i]);
		if(int1%3==0&&int1%5==0) {
			e[i]="Fizzbuzz";
		}
		else if(int1%3==0) {
			e[i]="fizz";
		}
		else if (int1%5==0) {
			e[i]="buzz";
		}
		else {
			e[i]=int1+"";
		}
	}
	System.out.println(Arrays.toString(e));
}
}
