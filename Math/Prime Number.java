package Practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;

		for (int i = 2; i <= 50; i++) {
			int count = 0;//1 

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				total++;
				System.out.println(i);
			}
		}

	}

}
