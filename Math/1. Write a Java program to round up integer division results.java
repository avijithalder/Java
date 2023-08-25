package Practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TotalMarks = 500;
		int TotalPracticalMarks = 90;
		int TotalTheoryMarks = 350;
		

		int Parcent = ((TotalTheoryMarks + TotalPracticalMarks)*100) / TotalMarks;

		System.out.println("Percentage of Marks: " + Parcent);
	}

}
