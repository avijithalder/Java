package Assessment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int x = 0, y = 1, z = 0;

		while (z <= n) {
			x = y;
			y = z;
			z = x + y;
			System.out.print(z + " ");
		}

	}
}
