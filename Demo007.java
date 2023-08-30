package org.abijeeth.jdbc;

import java.util.Scanner;

public class Demo007 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int ne = sc.nextInt();
		 String s1="     ";
		 String s2="*****";
		 for(int i=0,j=ne;i<ne;i++,j--) {
     System.out.print(s1.substring(i)+s2.substring(j-1));	
     System.out.println();
		 }
		 
	}

}
