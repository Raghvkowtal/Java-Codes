package com.kodnest.alphabets;

public class G {

	public static void main(String[] args)  {
		int n=10;
	for(int i=0; i<=n; i++) {
		for(int j=0; j<=n; j++) {
			if(i==0||i==n||j==0||(j==10 && i>=n/2)) {
				System.out.print("*");
			}else
				System.out.print(" ");
		}
		System.out.println( );
	}
}

}
