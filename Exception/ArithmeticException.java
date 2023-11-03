package Practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int num1;
		int num2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		num1 = input.nextInt();
		System.out.print("Enter Second Number: ");
		num2 = input.nextInt();

		try {
			int result = num1 / num2;
			System.out.println("Result is: " + result);

		} catch (ArithmeticException e) {
			System.out.println("You cant Divide " + e.getMessage());
		}

		finally {
			System.out.println("Done ");
		}
	}

}
