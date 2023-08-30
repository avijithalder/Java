package Assessment2;

class A {

	void display() {
		System.out.println("Inside A class");
	}
}

class B extends A {
	// display(

	@Override
	void display() {
		super.display();
		System.out.println("Inside B class");
	}
}

public class Main {

	public static void main(String[] args) {
		B b = new B();
		b.display();

	}
}
