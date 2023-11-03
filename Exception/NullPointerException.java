package Practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		String str="dasdada";
		
		System.out.println("Letter number is "+str.length());
		
		String str1= null;  /// Variable is not pointing to anything
//		
//		System.out.println("Letter number is "+str1.length());
//		
		try {
		
		} catch (NullPointerException e) {
			System.out.println("Variable is not pointing to anything" + e.getMessage());
		}

		finally {
			System.out.println("Done ");
		}
	}

}
