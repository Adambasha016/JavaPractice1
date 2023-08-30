package org.basic.prg.code.repet.code;

public class UsingSingleForLoop {
public static void main(String[] args) {
	int n=5;
	String s1="-----";
	String s3="*****";
	for(int i=0,j=n;i<n;i++,j--) {
		System.out.println(s1.substring(i)+s3.substring(j-1));
	}
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	int h=5;
	for(int i=1;i<=n;i++) {
		System.out.print("*");
		if(i==n) {
			i=0;
			n--;
			System.out.println();
		}
	}
	
	
}
}
