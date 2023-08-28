/*
********
*******
******
*****
****
***
**
*
*/
package Star;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int array[][] = new int[8][8];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
