package Assessment2;

import java.time.LocalDate;
import java.time.Period;

class Employee {
	private String name;
	private int salary;
	private LocalDate hierdate;

	Employee(String name, int salary, LocalDate hierdate) {
		this.name = name;
		this.salary = salary;
		this.hierdate = hierdate;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getsalary() {
		return salary;
	}

	public void setsalary(int salary) {
		this.salary = salary;
	}

	public LocalDate gethierdate() {
		return hierdate;
	}

	public void sethierdate(LocalDate hierdate) {
		this.hierdate = hierdate;
	}

	public int getYearofService() {
		return Period.between(hierdate, LocalDate.now()).getYears();
	}

	public void diaplay() {
		System.out.println("\nName: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("HireDate: " + hierdate);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
		Employee employee2 = new Employee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
		Employee employee3 = new Employee("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));
	    employee1.diaplay();
		System.out.println("Years of Service: " +employee1.getYearofService());
		employee2.diaplay();
		System.out.println("Years of Service: " +employee2.getYearofService());
		employee3.diaplay();
		System.out.println("Years of Service: " +employee3.getYearofService());
	    
	    

	}
}
