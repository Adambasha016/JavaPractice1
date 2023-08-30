package org.basic.prg.code.repet.code;

public class ReverseAnArray {

	public static void main(String[] args) {
		int ad[]= {1,2,3,4,5,6,7,8};
		int len=ad.length;
		int sti=3   ;
		rotate(ad, sti);
//				rotateAnArray(ad, sti, len);
				for(int s:ad) {
					System.out.print(s);
				}
	}
	
	
	
	public static void rotateAnArray(int []as,int start,int ln) {
		int p=1;
		while(p<=start) {
			int temp=as[0];
			for(int i=0;i<ln-1;i++) {
				as[i]=as[i+1];
				
			}
			as[ln-1]=temp;
			p++;
		}
		
	}
	// ********** efficient approach ************************************************************************************
	public static void reverse(int a[],int st,int end) {
		while(st<end) {
			int temp=a[st];
			a[st]=a[end];
			a[end]=temp;
			st++;
			end--;
		}
	}
	public static void rotate(int []a,int k) {
		k=k%a.length;
		if(k<0) {
			k=k+a.length;
		}
		reverse(a,0, k-1);
		reverse(a,k, a.length-1);
		reverse(a,0, a.length-1);
	}
	
}

