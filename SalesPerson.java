package payroll;

public class SalesPerson extends Employee{
int target;
double incentive;


public SalesPerson(int id, String name, double basic_salary, double hra, double lta, double da, double pf, double tax,
		int target, double incentive) {
	super(id, name, basic_salary, hra, lta, da, pf, tax);
	this.target = target;
	this.incentive = incentive;
}


@Override
public void computeSalary() {
	// TODO Auto-generated method stub
	double netsalary;
	if(target>20) {
		  netsalary=basic_salary + hra + da + lta - pf - tax + incentive;
	}else {
		 netsalary=basic_salary + hra + da + lta - pf - tax;
	}
	System.out.println("the sales person salary is"+netsalary);
}
}