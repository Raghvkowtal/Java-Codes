package com.kodnest.complex11x11.pattern;

public class pattern11 {

	public static void main(String[] args)  {
		int n=10;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(i==n && j==n/2||j==n) {
					System.out.print("*");
				}else
					System.out.print("");
			}
			System.out.println( );
		}
	}

}