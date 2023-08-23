package Practice;

class person {

	String name;
	int age;

	public void dislay() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

class teacher extends person {

	String qualification;

	public void display2() {
		dislay();
		System.out.println("Qualification : " + qualification);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teacher t1 = new teacher();
		t1.name = "Avijit";
		t1.age = 20;
		t1.qualification = "Student in CSE";
		t1.display2();
	}

}
