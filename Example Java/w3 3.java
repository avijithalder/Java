package Practice;

class Circle {
	int width, height;

	public Circle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void setwidth(int width) {
		setwidth(width);
	}

	public int getwidth() {
		return (width);
	}

	public void setheight(int height) {
		setheight(height);
	}

	public int getheight() {
		return (height);
	}

	public int area() {
		return width * height;
	}

	public int perimeter() {
		return 2 * (width + height);
	}
	public void diplay()
	{
		System.out.println("Area :"+area()+" Perimeter :"+perimeter());
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(7,12);
		Circle c2=new Circle(3,3);
		c1.diplay();
		c2.diplay();
		
	}

}
