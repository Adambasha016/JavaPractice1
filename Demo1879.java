package org.abijeeth.jdbc;

public class Demo1879 {
public static void main(String[] args) {
//	int x=2;
//	int y=0;
//	for(;y<10;y++) {
//		if(y%x==0) {
//			c ontinue;
//		}
//		else if(y==8) {
//			break;
//		}
//		else {
//			System.out.println(y+" ");
//		}
//	}
	
//	for(int i=0;i<5;i++) {
//		if(i==3) {
//			break;
//		}
//		System.out.print(i);
//	}
	
//	for(int i=0;i<5;i++) {
//		if(i==3) {
//			continue;
//		}
//		System.out.println(i);
//	}
	int[]a= {0,2,4,1,3}; 
	for(int i=0;i<a.length;i++) {
		//System.out.println(a.length+"le");
		System.out.println(a[i]+3+" hg");
		System.out.println(a[(a[i]+3)%a.length]);
		System.out.println( a[i]=a[(a[i]+3)%a.length]);
	}
	
	
	
	
	
}
}
