package Assessment2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.print("Enter How many index : ");

		Scanner Sc = new Scanner(System.in);

		int n = Sc.nextInt();
		int[] myarray = new int[n];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		System.out.print("Enter Your Elements : ");
		for (int i = 0; i < myarray.length; i++) {
			myarray[i] = Sc.nextInt();
			if (myarray[i] < min) {
				min = myarray[i];
			}
			if (myarray[i] > max) {
				max = myarray[i];
			}
		}
		System.out.println("Maximum element is " + max);
		System.out.println("Minimum element is " + min);

	}
}
