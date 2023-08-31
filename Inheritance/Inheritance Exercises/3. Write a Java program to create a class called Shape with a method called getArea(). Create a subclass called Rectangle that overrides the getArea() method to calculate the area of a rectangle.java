package Assessment2;

class Shape {

	public double getArea() {
		return 0.0;
	}
}

class Rectangle extends Shape {
	private double width;
	private double lenght;

	public Rectangle(double width, double lenght) {
		this.width = width;
		this.lenght = lenght;
	}

	@Override
	public double getArea() {
		return lenght * width;
	}
}

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3.0, 10.0);
		double area = rectangle.getArea();
		System.out.println("The area of the rectangle is: " + area);
	}
}
