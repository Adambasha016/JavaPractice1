package org.abijeeth.jdbc;

import java.util.Scanner;

public class Demo006 {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int i=1;
	while(i<=a) {
		System.out.print(i+"* ");
		if(i==a) {
			i=0;
			--a;
			System.out.println();
		}	
		i++;
	}
//	for(int i=1;i<=a;i++) {
//		System.out.print("* ");
//		if(i==a) {
//			i=1;
//			--a;
//			System.out.println();
//		}
	}
}
