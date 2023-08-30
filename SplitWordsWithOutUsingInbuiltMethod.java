package org.basic.prg.code.repet.code;

public class SplitWordsWithOutUsingInbuiltMethod {
public static void main(String[] args) {
	String p="java is oop language";
	String s="";
	for(int i=0;i<p.length();i++) {
		char at = p.charAt(i);
		if(at==' ') {
			System.out.println(s);
			s="";
		}
		else {
			s+=at;
		}
	}
	System.out.println(s);
}
}
