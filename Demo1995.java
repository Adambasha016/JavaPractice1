package org.abijeeth.jdbc;

public class Demo1995 {
	public static void main(String[] args) {
		String s1="java is a programming language   ";
		int  count=0;
		String s2="";
		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			if(c==' ') {
				if(s2!="")System.out.println(s2+" -->"+ count);
				count=0;
				s2="";
			}
			else
			{
				s2+=c;
				count++;
			}
		}
		if(s2!="") System.out.println(s2+" --> "+count);
	}
}
