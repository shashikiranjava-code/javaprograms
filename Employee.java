package payroll;

public class Employee {
	int id;
	String name;
	double basic_salary;
	double hra;
	double lta;
	double da;
	double pf;
	double tax;
	//static variable, it will have only one copy per class
	static String companyname = "acharya";
	//default constructor
	public Employee() {
		
	}
	public Employee(int id, String name, double basic_salary, double hra, double lta, double da, double pf,
			double tax) {
		super();
		this.id = id;
		this.name = name;
		this.basic_salary = basic_salary;
		this.hra = hra;
		this.lta = lta;
		this.da = da;
		this.pf = pf;
		this.tax = tax;
	}
	
	public void computeSalary() {
		double netsalary = basic_salary + hra + da + lta - pf - tax;
		System.out.println("The employee net salary of "+id+" whose name is "+name+" is "+ netsalary);
	}

}