package For_Own;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter First Number : ");
		Scanner input1 = new Scanner(System.in);
		int a = input1.nextInt();

		System.out.print("Enter Second Number : ");
		Scanner input2 = new Scanner(System.in);
		int b = input2.nextInt();

		int c;

		c = a & b;
		System.out.println("a & b = " + c);

		c = a | b;
		System.out.println("a | b = " + c);

		c = a ^ b;
		System.out.println("a ^ b = " + c);

		c = a >> 3; // 3 diye gun 
		System.out.println("a >> b = " + c);

		c = a << 3; // 3 diye vag
		System.out.println("a << b = " + c);

		c = a - b;
		System.out.println("a - b = " + c);

	}
}
