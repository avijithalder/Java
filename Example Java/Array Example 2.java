package Grade.System;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] myArray = new int[3][5];

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i].length);
			for (int j = 0; j < myArray[i].length; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

}
