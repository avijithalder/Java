package Grade.System;

import java.util.Scanner;

class Student {

	String name;
	int id;
	double cgpa;

	Student(String name, int id, double cgpa) {
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
	}

	void display() {
		System.out.println("NAME : " + name);
		System.out.println("iD: " + id);
		System.out.println("CGPA : " + cgpa);
	}

}

public class Main {

	public static void main(String[] args) {

		Student[] myStudents = new Student[4];
		myStudents[0] = new Student("Rakib", 1, 4);
		myStudents[0].display();
		myStudents[1] = new Student("Tanvir", 2, 3.9);
		myStudents[2] = new Student("Habijabi", 3, 3.9);
		myStudents[3] = new Student("Again Habijabi", 4, 3.9);

	}

}
