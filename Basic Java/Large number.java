package For_Own;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter two numbers : ");
		Scanner input = new Scanner(System.in);

		int num1,num2,large;
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		large=(num1>num2)? num1:num2;
		System.out.print("Large Number : "+large);
	}
}
