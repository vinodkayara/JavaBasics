package com.practice;

public class PatternPractice {
	
	public static int Rev(int num) {
		int res=0;
		while(num!=0) {
			int rem=num%10;
			 res=(res*10)+rem;
			num=num/10;
			
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int n=10;
		int k=1;
		
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;) {
							    
//			    int res= Rev(num);
				
				if(k==Rev(k)) {
					
					System.out.print(k+" ");
					col++;
				}
				k++;
			}
			System.out.println();
		}

	}

}

