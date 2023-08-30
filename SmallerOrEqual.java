package org.basic.prg.code.repet.code;

public class SmallerOrEqual {
  public static int counSmallOrEqual(int[]a,int key) {
	  int l=0,h=a.length-1,mid=0;
	  while(l<h) {
		  mid=(l+h)/2;
		  if(key==a[mid]) {
			  while(mid+1<a.length&&a[mid+1]==key) {
				  mid++;
			  }
			  break;
		  }
		  else if(key<a[mid]) {
			  h=mid-1;
		  }
		  else {
			  l=mid+1;
		  }
	  }
	  if(a[mid]>key) {
		  return mid;
	  }
	  else {
		   return mid+1;
	  }
  }
  
  public static void main(String[] args) {
	int a[]= {2,6,12,18,21,26,33,42};
	System.out.println(counSmallOrEqual(a, 6    ));
}
}
