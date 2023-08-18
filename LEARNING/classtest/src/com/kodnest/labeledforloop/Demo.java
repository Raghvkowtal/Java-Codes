package com.kodnest.labeledforloop;

public class Demo {

	public static void main(String[] args) {
		System.out.println("ROBO......");
		int i=1;
		a:do {
			int j=1;
			b:do {
				System.out.println("* ");
				j++;
				break a;
			}while(j<=5);
		}i++;
		}
	}

