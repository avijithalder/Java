package Practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		int arr[]=new int[100];
		arr[10]=104555;
		
		System.out.println("You can print array length "+arr.length);
		
		
		try {
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You cant Divide " + e.getMessage());
		}

		finally {
			System.out.println("Done ");
		}
	}

}
