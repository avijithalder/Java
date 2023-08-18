package Grade.System;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] myarray = new int[3][3];

		for (int i = 0; i < myarray.length; i++) {
			for (int j = 0; j < myarray.length; j++) {
				System.out.print("i= " + i + "j= " + j + " ");
				int a = sc.nextInt();
				myarray[i][j] = a;
			}
			System.out.print("\n");
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i = " + i + " j = " + j + " value = " + myarray[i][j]);

			}
			System.out.println("\n");
		}
		for (int i = 0; i < myarray.length; i++) {
			for (int j = 0; j < myarray.length; j++) {
				System.out.print(myarray[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
