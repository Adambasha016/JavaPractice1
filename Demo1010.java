package org.abijeeth.jdbc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo1010 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b= s.nextInt();
		int size=a+b;
		String [] g=new String[(b-a)+1];
	//	System.out.println(b-a+1);
		
		//ArrayList f=new ArrayList<String>();
		for(int i=a,c=0;i<=b;i++,c++) {
			if(i%3==0&&i%5==0) {
				g[c]="FizzBuzz";
			//	f.add("FizzBuzz");
			}
			else if(i%3==0) {
				g[c]="Fizz";
				
				//f.add("Fizz");
			}
			else if(i%5==0) {
				g[c]="Buzz";
				//f.add("buzz");
			}
			else {
				g[c]=i+"";
				//f.add(i);
			}
		}
		System.out.println(Arrays.toString(g) );
		//System.out.println(f);
	//f.clone();
	}
}
