package com.kodnest.alphabets;

public class Z {
	public static void main(String[] args) {
	int n=10;
	for(int i=0; i<=n; i++) {
		for(int j=0; j<=n; j++) {
			if(i==0||i==10||(i==1 && j==9)||(i==2 && j==8)
					||(i==3 && j==7)||(i==4 && j==6)||(i==5 && j==5)
					||(i==6 && j==4)||(i==7 && j==3)||(i==8 && j==2)
					||(i==9 && j==1)||(i==10 && j==0)) {
				System.out.print("*");
			}else
				System.out.print(" ");
		}
		System.out.println( );
	}
}
}



	
	
	
	
	
	
	
	
