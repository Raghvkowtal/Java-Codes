package com.kodnest.alphabets;

public class X {

	public static void main(String[] args)  {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if((i==1 && j==1)||(i==2 && j==2)
						||(i==3 && j==3)||(i==4 && j==4)||(i==4 && j==5)
						||(i==5&&j==5)||
						(i==6&&j==4)||(i==7&&j==3)||(i==8&&j==2)
						||(i==9&&j==1)
						||(i==6&&j==5)||(i==7&&j==6)||(i==8&&j==7)||(i==9&&j==8)
						||(i==3 && j==6)||(i==2 && j==7)||(i==1 && j==8)) {
					System.out.print("* ");
				}else
					System.out.print(" ");
			}
			System.out.println( );
		}
	}

}
