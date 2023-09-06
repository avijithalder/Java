package Assessment2;

class Box {
	double length;
	double height;
	double width;

	Box(double length, double height, double width) {
		this.length = length;
		this.height = height;
		this.width = width;
	}

	void display() {
		System.out.println(length);
		System.out.println(height);
		System.out.println(width);

	}

	Box equalBox() {
		Box newbox = new Box(this.length, this.height, 55);
		return newbox;
	}
}

public class Main {

	public static void main(String[] args) {
		Box box = new Box(2, 6, 8);
		box.display();
		Box newbox = box.equalBox();
		newbox.length=50;
		newbox.display();

	}
}
