package Practice;

class Employee {
	private String name;
	private String job_title;
	private double salary;

	Employee(String name, String job_title, double salary) {
		this.name = name;
		this.job_title = job_title;
		this.salary = salary;
	}

	public String getname() {
		return name;

	}

	public void setname(String name) {
		this.name = name;
	}

	public String getjob_title() {
		return job_title;
	}

	public void setjob_title(String job_title) {
		this.job_title = job_title;
	}

	public double getsalary() {
		return salary;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public void upsalary(double percentage) {
		salary = salary + salary * percentage / 100;
	}

	public void dispay() {
		System.out.println("Name : " + name);
		System.out.println("Job Title : " + job_title);
		System.out.println("salary : " + salary);
		System.out.println("Update Salary : " + getsalary());
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee person1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
		person1.dispay();
		System.out.println("");
		person1.upsalary(8);
		person1.dispay();

	}
}
