package Assessment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("How Many Element You Input : ");
		int n = Sc.nextInt();
		int[] myarray = new int[n];

		for (int i = 0; i < n; i++) {
			myarray[i] = Sc.nextInt();
		}

		for (int i = 0; i < myarray.length; i++) {

			System.out.println("index : " + i + " = " + myarray[i]);
		}
		System.out.println("Search Element Index Number: ");
		int S = Sc.nextInt();
		for (int i = 0; i < myarray.length; i++) {
			if (S == myarray[i]) {
				System.out.println("Elements Index Number: " + i);
			}
		}
	}
}
