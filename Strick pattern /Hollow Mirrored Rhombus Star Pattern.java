/*
********
 *      *
  *      *
   *      *
    *      *
     *      *
      *      *
       *      *
        ********
*/
package Assessment2;

import java.util.Arrays;

class Main {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 8; k++) {

				if (i == 1 || i == 9 || k == 1 || k == 8)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}

			System.out.print("\n");

		}

	}
}
