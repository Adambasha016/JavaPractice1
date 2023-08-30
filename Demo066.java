package org.abijeeth.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo066 {
public static void main(String[] args) {
     BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
     try {
		int n = buf.read();
		for(int i=1;i<=n;i++) {
			System.out.print("*");
			if(i==n) {
				i=1;
				n--;
				System.out.println();
			}
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
