package com.kodnest.labeledforloop;

public class labeledwhile {

	public static void main(String[] args) {
		System.out.println("hello...");
		int a=1;
		a:while(a<=5) {
			int b=1;
			b:while(b<=5) {
				System.out.print("* ");
				b++;
				break a;
			}
			a++;
			System.out.println(" ");
		}
	}

}
