package org.abijeeth.jdbc;

public class ChekingTwoStringsAreEqualOrNot {
	public static void main(String[] args) {
		String 	s1="abcd";
		String	s2="bcda";
		//System.out.println(rotate(s1, s2));
	if(rotate(s1, s2)) System.out.println("both string are equal after rotation");
	else System.out.println("not same after rotation");
	}
	public static boolean rotate(String a1,String a2) {
		if(a1.length()!=a2.length()) 	return false;
		else{
			for(int i=0;i<a2.length();i++) {
			if(a1.equals(a2)) return true;
			else {
				char first=a2.charAt(0);
				String s3=a2.substring(1);
				a2=s3+first;
			}
		}
		return false;
	}
}
}