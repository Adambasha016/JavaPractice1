package org.abijeeth.jdbc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindingMissingNumberInAnArray {
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9,10,11,13};
		int num1[]= {0,1,2,3,4,6,7,8};
		System.out.println(missingNumber1(num));
		//	System.out.println(missingNumber2 (num));
		//	System.out.println(missingNumber3 (num)+" 3 way");
		//System.out.println(missingNumber4 (num)+" 4 way");
		//		System.out.println(missingNumber5 (num)+" 5 way");
		//		System.out.println(missingNumber6 (num1)+" 6 way");
		System.out.println(missingNumber7 (num)+" 7 way");
		//		missingNumber5 (num);
	}
	//*********************************************************************************
	public static int missingNumber1(int[]num) {
		int sum_range=0;
		int sum_org=0;
		for(int i=1;i<=num.length;i++) {
			sum_range+=i;
		}
		for(int j=0;j<num.length;j++) {

			sum_org+=num[j];
		}
		System.out.println(sum_org+" "+sum_range);
		return sum_org-sum_range;
	}
	//*********************************************************************************
	public static int missingNumber2(int[]num) {
		int n=num.length+1;
		int tota_sum=(n*(n+1))/2;
		System.out.println(tota_sum+" "+n);
		for(int s:num) {
			tota_sum-=s;
		}
		return  tota_sum;
	}
	//*********************************************************************************
	public static int missingNumber3(int []num) {
		int expect=0;
		int real=num[0];
		for(int i=1;i<=num.length;i++){
			expect=expect^i;
			if(i!=num.length) {
				real=real^num[i];
			}
		}
		int res=real^expect;
		return res;
	}
	//*********************************************************************************
	//{1,2,3,5,6,7,8,};
	public static int missingNumber4(int []num) {
		int arr[]=new int[num.length+1];
		for(int i=0;i<num.length;i++) {
			arr[num[i]]=1;
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==0) {
				return j;
			}
		}
		return 0;
	}
	//*********************************************************************************
	public static int missingNumber5(int []num) {
		HashMap<Integer, Integer> map=new HashMap<>();
		int n=num.length;
		for(int i=0;i<n;i++) {
			map.put(num[i],1);
		}
		System.out.println(map);
		for(int i=1;i<=n;i++) {
			if(map.get(i)==null) return i;
		}
		return -1;
	}
	//*********************************************************************************
	public static int missingNumber6(int []num) {
		int n=num.length;

		//		it should be short position//Arrays.sort(num);
		for(int i=1;i<n;i++) {
			if(i!=num[i]) {
				return num[i]-1;
			}
		}
		return num[n-1]+1;
	}
	//*********************************************************************************
	public static int missingNumber7(int []num) {
		int n=num.length;
		HashSet<Integer> Set = new HashSet<>();
		for(int i=0;i<n;i++) {
			Set.add(num[i]);
		}
		
		 System.out.println(Set);
		for(int i=1;i<=n;i++) {
			if(!Set.contains(i)) {
				return i;
			}
		}
		return n+1;
	}
}