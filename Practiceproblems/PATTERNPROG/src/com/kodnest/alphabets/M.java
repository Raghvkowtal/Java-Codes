package com.kodnest.alphabets;

public class M {

	public static void main(String[] args)  {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if(j==0||j==10||(i==1 && j==1)||(i==2 && j==2)
						||(i==3 && j==3)||(i==4 && j==4)||(i==4 && j==5)
						||(i==3 && j==6)||(i==2 && j==7)||(i==1 && j==8)) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println( );
		}
	}

}