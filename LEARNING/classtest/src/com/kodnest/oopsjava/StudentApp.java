package com.kodnest.oopsjava;

public class StudentApp {

	public static void main(String[] args) {
		Student S1 = new Student();
		Student S2 = new Student();
		
		S1.eat();
		S2.study();
		S1.sleep();
		S2.eat();
		
		S1.id=1;
		S1.name="Balagi";
		S1.age=22;
		S1.branch= "CS";
		
		S2.id=2;
		S2.name="Sahana";
		S2.age=24;
		S2.branch= "EC";
		
		System.out.println(S1.id);
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S1.branch);
		
		System.out.println(S2.id);
		System.out.println(S2.name);
		System.out.println("age of student 2 is  "+S2.age);
		System.out.println(S2.branch);

	}

}
