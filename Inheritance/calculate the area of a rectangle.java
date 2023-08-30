package Assessment2;

class Shape {
	public double getArea() {
		return 0;
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length * width;

	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(3.0, 10.0);
		double area = r.getArea();
		System.out.println("The area of the rectangle is: " + area);

	}
}
