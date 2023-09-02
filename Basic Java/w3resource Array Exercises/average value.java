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

		int count = 0;
		int avg = 0;
		for (int i = 0; i < myarray.length; i++) {
			count = count + myarray[i];

		}

		for (int i = 0; i < myarray.length; i++) {
			System.out.println(i + " Element is : " + myarray[i]);
		}
		avg = (count / n);
		System.out.println("Average is : " + avg);
	}
}
