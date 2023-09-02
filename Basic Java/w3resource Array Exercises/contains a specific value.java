package Assessment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("How many Elements You want: ");
		int n = Sc.nextInt();
		int[] myarray = new int[n];
		int found = 0;

		for (int i = 0; i < n; i++) {
			myarray[i] = Sc.nextInt();
		}

		System.out.print("Enter Your Search Elements : ");
		int s = Sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (s == myarray[i]) {
				found = 1;
				break;

			}
		}
		if (found == 1) {
			System.out.println("Found ");
			System.out.println("Element is : " + s);
		} else {
			System.out.println("Not Found ");
		}
	}
}
