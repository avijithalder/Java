/*
****
****
***
***
**
**
*
*
*/
package Assessment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for (int i = 4 * 2; i >= 1; i--) {
			for (int j = 1; j <= i; j = j + 2) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
