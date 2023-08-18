package Grade.System;

import java.util.Scanner;

class Box {

	double length;
	double height;
	double width;

	public Box(double length, double height, double width) {
		this.length = length;
		this.height = height;
		this.width = width;
	}

	public Box() {
	}

	double calculateVolume() {
		return length * height * width;
	}

}

public class Main {

	public static void main(String[] args) {

		Box[] myBox = new Box[3];
		myBox[0] = new Box(1, 2, 3);
		myBox[1] = new Box(4, 5, 6);
		myBox[2] = new Box(1, 5, 7);
		System.out.println(myBox[0].calculateVolume());
		System.out.println(myBox[1].calculateVolume());
		System.out.println(myBox[2].calculateVolume());

	}

}
