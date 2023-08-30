package org.basic.prg.code.repet.code;

public class SquareRootOfANumber {
   public static void main(String[] args) {
//	System.out.println(squareRoot(6));
	System.out.println(isSquare(4));
}
	 
   
   
   public static int squareRoot(int n) {
	   if(n==0||n==1) {
		   return n;
	   }
	   int res=0;
	   int s=2,e=n/2;
	   while(s<=e) {
		   int mid=(s+e)/2;
		   System.out.println(mid+"mid");
		   if(mid*mid==n) {
			   return mid;
		   }
		   else if (mid*mid<n) {
			   s=mid+1;
			   res=mid;
		   }
		   else { e=mid-1;
	   }
   }
	   
   return res;
   }   
   
	public static int isSquare(int z) {
		if(z==1||z==0) {
			return z;
		}
		for(int i=2;i<=z/2;i++) {
			if(i*i==z) {
				return i;
			}
		}
		return -1;
	}
}
