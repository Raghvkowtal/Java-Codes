package com.kodnest.fifthproblem;

import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter speed and time of train");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		JournryCalculator journeyCalculator=new JournryCalculator();

		double distance=journeyCalculator.calculateDistance(speed, time);

		System.out.println(distance);
	}

}
