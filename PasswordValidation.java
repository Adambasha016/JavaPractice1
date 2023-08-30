package org.abijeeth.jdbc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String next = sc.next();
	Pattern compile = Pattern.compile("[6-9][0-9]{9}");
	Matcher matcher = compile.matcher(next);
	if(matcher.matches()) {
		System.out.println("valid");
	}
	else {
		System.out.println("in vALID");
	}
	
}
}
