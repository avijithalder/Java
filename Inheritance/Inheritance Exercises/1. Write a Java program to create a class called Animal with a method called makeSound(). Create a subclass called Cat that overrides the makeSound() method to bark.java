package Assessment2;

class Animal {
	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("The cat quarrels.");
	}
}

public class Main {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.makeSound();
	}
}
