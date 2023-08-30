package org.abijeeth.jdbc;

public class Demo1998 {
public static void main(String[] args) {
	String s1="abcd";
	String s2 ="bcda";
	System.out.println(chechEqualOrNot(s1, s2));
	System.out.println(s1.equals(s2));
}
public static boolean chechEqualOrNot(String s1,String s2) {
	String a="";
	int count=0;
		//char[] cs = s2.toCharArray();
while(count<s2.length()) {
	 //a+=s2.charAt(0);
	 for(int i=1;i<s2.length();i++) {
		 a+=s2.charAt(i);
	 }
	 a+=s2.charAt(0);
	 count++;

if(s1.equals(a)==true) {
	System.out.println(count+"count");
	return true;
}

}
System.out.println(count+" w");


return false;
}
public static void chek(String s1,String s2) {
	
}


}