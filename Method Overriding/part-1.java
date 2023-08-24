package Practice;

class person {
	String name;
	int id;

	public void display() {
		System.out.println(name);
		System.out.println(id);
	}
}

class result extends person {

	double res;

	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(res);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result r = new result();
		person p = new person();
		r.id = 200;
		r.name = "Avijit";
		r.res = 4.00;
		r.display();

		p.name = "Mondira";
		p.id = 500;
		p.display();
	}
}
