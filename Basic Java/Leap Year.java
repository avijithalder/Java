package Avijit_Halder;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Your Year : ");
		Scanner input = new Scanner(System.in);

		int year;
		year = input.nextInt();

		if (year % 400 == 0) {
			System.out.print(year + " Is Leap Year ");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.print(year + " Is Leap Year ");
		} else {
			System.out.print(year + " Is Not Leap Year ");
		}

	}

}
