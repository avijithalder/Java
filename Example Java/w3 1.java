package Practice;

class person {
	private String name;
	private int age;

	public person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void setname(String name) {
		setname(name);
	}

	public String getname() {
		return name;
	}

	public void setage(int age) {
		setage(age);
	}

	public int getage() {
		return age;
	}

	public void display() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1 = new person("Avijit", 20);
		person p2 = new person("Mondira", 30);
		p1.display();
		p2.display();
	}

}
