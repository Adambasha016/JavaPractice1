package org.basavannagudi.jsp.Welldoc;

public class ExamNestWestCompany {
	public static void main(String[] args) {
		
		//System.out.println(null);//The method println(char[]) is ambiguous for the type PrintStream
		int [][] salesRecord= { {100,198,333,323},
				                {122,232,221,111},
				                {223,565,245,764}
				              };
		int [] max=new int[salesRecord.length];
		for(int i=0;i<salesRecord.length;i++) {
			int max2=0;
			for(int j=0;j<salesRecord[i].length;j++) {
				if(max2<salesRecord[i][j]) {
					max2=salesRecord[i][j];
				}
			}
			max[i]=max2;
		}  
	//System.out.println(salesRecord.length);
	for(int r:max) {
	System.out.println(r);
	}

}
}
