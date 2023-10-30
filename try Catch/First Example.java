package Practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count = 1;
		do {
			try {
				Scanner input = new Scanner(System.in);

				System.out.print("Please Enter num1 : ");
				int num1 = input.nextInt();
				System.out.print("Please Enter num2 : ");
				int num2 = input.nextInt();

				int Result = num1 / num2;
				System.out.println("Result:" + num1 + "/" + num2 + "= " + Result);
				count = 2;
			} catch (Exception e) {
				System.out.println("Exception: " + e);
				System.out.println("You must enter integer.Please try agin");
			}
		} while (count == 1);
	}
}
