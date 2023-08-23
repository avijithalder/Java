package Practice;

class person {
	private String name;
	private int age;

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getage() {
		return age;
	}
}

class teacher extends person {

	private String qualification;

	public void setqualification(String qualification) {
		this.qualification = qualification;
	}

	public String getqualification() {
		return qualification;
	}

	void diplay() {
		System.out.println(getname());
		System.out.println(getage());
		System.out.println(getqualification());
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teacher t1 = new teacher();
		t1.setname("Avijit");
		t1.setage(22);
		t1.setqualification("Ms in Cse");
		t1.diplay();
	}

}
