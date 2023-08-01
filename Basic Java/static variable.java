package Student_Detail;

class data {
	String name;
	int id;
	static String versityName = "DIU";

	data(String n, int i) {
		name = n;
		id = i;

	}

	void disPlayPrint() {
		System.out.print(" Name " + name);
		System.out.print(" ID " + id);
		System.out.print(" Versity Name " + name);

	}
}

public class Student {

	public static void main(String[] args) {

		data d1 = new data("Avijit", 1001);
		data d2 = new data("Anis", 2002);

		d1.disPlayPrint();
		System.out.println("");
		d2.disPlayPrint();

	}

}
