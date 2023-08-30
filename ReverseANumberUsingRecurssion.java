package org.basic.prg.code.repet.code;

public class ReverseANumberUsingRecurssion {
public static void main(String[] args) {
	
	System.out.println(reves(12345, 0));
	
}


public static int reves(int n,int rev) {
	if(n<=0) {
		return rev;
	}
	return reves(n/10,(rev*10)+n%10);
}
}
