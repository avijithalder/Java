package Assessment2;

class Vehicle {
	public void drive() {
		System.out.println("Ghorar Matha");
	}
}

class Car extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Repairing a car");
	}
}

public class Main {

	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
	}
}
