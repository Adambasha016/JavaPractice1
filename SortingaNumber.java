package org.basic.prg.code.repet.code;

import java.util.Arrays;
import java.util.Scanner;

public class SortingaNumber {

public static void main(String[] args) {
	Scanner  ad= new Scanner(System.in);
	System.out.println("enter a number");
	 long n = ad.nextLong();
	String se=""+n;
	char[] cs = se.toCharArray();
//	for(char c:cs) {
//		System.out.println(c);
//	}
     Arrays.sort(cs);
	String s1="";
	
	for(char c:cs) {
		s1+=c;
	}
//	float int1 = (float)Integer.parseInt(s1);
        int parseInt = Integer.parseInt(s1);
	System.out.println(parseInt);
}}
