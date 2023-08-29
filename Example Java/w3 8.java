package Assessment2;

class TrafficLight {
	private String color;
	private int duration;

	public TrafficLight(String color, int duration) {

		this.color = color;
		this.duration = duration;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public String getcolor() {
		return color;
	}

	public void setduration(int duration) {
		this.duration = duration;
	}

	public int getduration() {
		return duration;
	}

	public boolean isGreen() {
		return color.equals("green");
	}

	public boolean isRed() {
		return color.equals("red");
	}

	public void changecolor(String newcolor) {
		color = newcolor;
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight t1 = new TrafficLight("red", 30);
		System.out.println("The light is " + t1.getcolor() + ": " + t1.isRed());
		System.out.println("The light is green: " + t1.isGreen());
		t1.changecolor("green");
		System.out.println("The light is now " + t1.getcolor() + ": " + t1.isGreen());
		System.out.println("The light duration is: " + t1.getduration());
		t1.setduration(20);
		System.out.println("The light duration is now: " + t1.getduration());

	}
}
