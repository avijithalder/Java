package Assingment1;

public class Main {

	public static void main(String[] args) {
		int search = 40;
		int found = 0;
		int[] myarray = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < myarray.length; i++) {
			if (search == myarray[i]) {
				found = 1;
				break;
			}
		}
		if (found == 1) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}

	}

}
