package com.kodnest.alphabets;

public class R {

	public static void main(String[] args){
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if(i==0||(j==10 && i<=10/2)||i==10/2||j==0||
						(i==6 && j==2)||(i==7 && j==3)||(i==8 && j==4)
						||(i==9 && j==5)||(i==10 && j==6)) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println( );
		}
	}

}