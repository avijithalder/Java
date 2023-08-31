package Assessment2;

//Cass
class Person {
	private String FirstName;
	private String LastName;

//method
	public Person(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;

	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}
}

//Sub class
class Employee extends Person {
	private int EmployeeId;
	private String jobtitle;

//method
	public Employee(String Firstname, String LastName, int EmployeeId, String jobtitle) {
		super(Firstname, LastName);
		this.EmployeeId = EmployeeId;
		this.jobtitle = jobtitle;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	@Override
	public String getLastName() {
		return super.getLastName() + ", " + jobtitle;
	}
}

public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
		System.out.println(
				employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
		Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");
		System.out.println(
				employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
	}
}
