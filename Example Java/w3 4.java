package Practice;

class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void setradius(double radius) {
		setradius(radius);
	}

	public double getradius() {
		return 2 * Math.PI * radius;
	}

	public void display() {
		System.out.println("Radius : " + getradius());
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = 5;
		Circle c1 = new Circle(n);
		c1.display();
	}
}
