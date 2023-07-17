package Avijit_Halder;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter Your Number : ");

		Scanner input = new Scanner(System.in);
		int number;
		number = input.nextInt();

		int store = 1;
		for (int i = 1; i <= number; i++) {
			store = store * i;
		}

		System.out.print(number + " Factorial is : " + store);

	}

}
