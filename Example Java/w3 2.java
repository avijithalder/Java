package Practice;

class Dog {
	String name;
	String breed;

	public Dog(String name, String breed) {

		this.name = name;
		this.breed = breed;
	}

	public void setname(String name) {
		setname(name);
	}

	public String getname() {
		return (name);
	}

	public void setbreed(String breed) {
		setbreed(breed);
	}

	public String getbreed() {
		return (breed);
	}

	public void display() {

		System.out.println("Name : " + name + " Breed : " + breed);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog("Avijit", "halder");
		Dog dog2 = new Dog("mondira", "halder");
		dog1.display();
		dog2.display();
	}

}
