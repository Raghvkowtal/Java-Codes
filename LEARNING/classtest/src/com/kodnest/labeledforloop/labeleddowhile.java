package com.kodnest.labeledforloop;

public class labeleddowhile {

	public static void main(String[] args) {
		int a=1;
		a:do{
			int b=1;
			b:do {
				System.out.println("* ");
				b++;
				break a;
			} while(b<=5);
		}while(a<=5);
		a++;
		System.out.println(" ");
	}

}
