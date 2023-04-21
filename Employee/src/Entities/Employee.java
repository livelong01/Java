package Entities;

public class Employee {

	public String Name;
	public double gSalary;
	public double tax;
	
	public Double lSalary() {
		return gSalary - tax;
	}
	
	public double increase(double percentage) {
		return lSalary() +(gSalary * (percentage/100));
	}
	
	}

	
