package payroll;

import payroll.Employee;
import payroll.Manager;
import payroll.SalesPerson;

public class Main {

	public static void main(String[] args) {

		Manager managerOne = new Manager(12, "rajesh", 10000.00, 2500.00, 1200.00, 1000.00, 1100.00, 2000.00, 0, true);
		managerOne.computeSalary();

		System.out.println("**********");

		Employee employeeOne = new Employee(21, "kiran", 8000.00, 2000.00, 1000.00, 800.00, 900.00, 0);
		employeeOne.computeSalary();

		System.out.println("**********");

		SalesPerson person = new SalesPerson(12, "guru", 10000.00, 2500.00, 1200.00, 1000.00, 1100.00, 21, 0, 20000.00);
		person.computeSalary();
	}
}