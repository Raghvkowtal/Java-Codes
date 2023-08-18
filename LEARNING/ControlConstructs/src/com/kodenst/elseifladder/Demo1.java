package com.kodenst.elseifladder;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the score");
		int score = scan.nextInt();
		Score s1 = new Score();
		s1.score(score);
	}

}
