package Student_Detail;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);
	}

	public static void count(String x) {
		char[] ch;
		ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		
		for (int i = 0; i < x.length(); i++) {
			
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				number++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				other++;
			}

		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + number);
		System.out.println("other: " + other);
	}
}
