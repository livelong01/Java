package Entities;

public class Employee {

	public String Name;
	public double gSalary;
	public double tax;
	
	public Double lSalary() {
		return gSalary - tax;
	}
	
	public void increase(double percentage) {
		gSalary += gSalary * (percentage/100);
	}
	public String toString() {
		return Name + ", $ " + String.format("%.2f", lSalary());
		}
	
	}

	
