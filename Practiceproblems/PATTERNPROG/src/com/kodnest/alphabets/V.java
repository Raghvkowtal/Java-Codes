package com.kodnest.alphabets;

public class V {

	public static void main(String[] args)  {
		int n=10;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i==1 && j==1)||(i==2 && j==2)
						||(i==3 && j==3)||(i==4 && j==4)||(i==4 && j==5)
						||(i==5&&j==5)
						||(i==3 && j==6)||(i==2 && j==7)||(i==1 && j==8)) {
					System.out.print("* ");
				}else
					System.out.print(" ");
			}
			System.out.println( );
		}
	}

}