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
		System.out.print("Delete Element Number: ");
		int S = Sc.nextInt();
		for (int i = 0; i < myarray.length - 1; i++) {
			if (S == myarray[i]) {

				myarray[i] = myarray[i + 1];
			}

			System.out.println("index : " + i + " = " + myarray[i]);
		}

	}
}
