package Assessment2;

import java.util.Scanner;

class Car {
	String modelName;
	double rentalCostPerHour;
	String isAvaiable;

	Car(String modelName, double rentalCostPerHour, String isAvaiable) {
		this.modelName = modelName;
		this.rentalCostPerHour = rentalCostPerHour;
		this.isAvaiable = isAvaiable;
	}

	void rentalcost(double time) {
		if (isAvaiable == "yes") {
			System.out.println("Yes,You can rent this car");
			rentalCostPerHour = rentalCostPerHour * 2;
		} else {
			System.out.println("This Car is Booked");
		}

	}

	void display() {

		System.out.println("Model Name: " + modelName);
		System.out.println("Rental Cost per Hour : " + rentalCostPerHour + " $");
		System.out.println("Avaiablity : " + isAvaiable);

	}
}

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car("BMW", 10, "yes");
		Car c2 = new Car("Hundai", 20, "No");
		c1.rentalcost(2);
		c1.display();
		System.out.println("\n");
		c2.rentalcost(2);
		c2.display();

	}
}
