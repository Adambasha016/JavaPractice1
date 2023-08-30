package org.abijeeth.jdbc;

import java.util.Arrays;

public class Demo05 {
public static void main(String[] args) {
	int a[][]={ {1,2,3,4},
			{5,6,7,8}
	};
int c[]= {0,0,0,0,5};
System.out.println(a.length);
for(int i=0;i<a.length;i++) {
System.out.println(Arrays.toString(a[i]));
}
//System.arraycopy(a, 0, c, 0, 4);
System.out.println(Arrays.toString(c));
}
}

