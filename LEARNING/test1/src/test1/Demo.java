package test1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of student");
		String a = scan.nextLine();
		System.out.println("Name of the student is "+a);
		System.out.println("What is the age of student");
		int b = scan.nextInt();
		System.out.println("Age of the student is "+ b);
		System.out.println("What is the CGPA of student");
		Float c = scan.nextFloat();
		System.out.println("CGPA of the student is "+ c);
		System.out.println("Is the student married ? say True or False");
		Boolean d = scan.nextBoolean();
		System.out.println("value stored in d is "+ d);
		System.out.println("What is the height of student");
		Double e = scan.nextDouble();
		System.out.println("height of the student is "+ e);
		System.out.println("What is the weight of student");
		Double f = scan.nextDouble();
		System.out.println("Weight of the student is "+ f);
		System.out.println("Enter the BRANCH of student");
		scan.nextLine();
		String g = scan.nextLine();
		System.out.println("Branch of the student is "+ g);
				
	}

}
