package org.abijeeth.jdbc;

public class Demo1994 {
	public static void main(String[] args) {
		String s1="abcd";
		int g=0;
		String s2="bcdh";
		System.out.println(chek(s1, s2, g));
	}

	public static boolean chek(String a,String b,  int i) {
		if(i<a.length()) {
			if(a.length()!=b.length()) 	return false;
			else if(a.equals(b)) 	return true;
			else {
				String string = rotate(b);
				return chek(a, string,i+1);
			}
		}
		return a.equals(b);
	} 
	public static String rotate(String b) {
		//int c=0;
		String s="";
		for(int i=1;i<b.length();i++) {
			s+=b.charAt(i);
		}
		s+=b.charAt(0);
		System.out.println(s+" as");
		return s;
	}

}
