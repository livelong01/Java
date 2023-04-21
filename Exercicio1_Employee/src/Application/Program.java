package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.gSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
				
		System.out.println("Employee: " + employee.Name + ", $ "+ String.format("%.2f", employee.lSalary()));
		System.out.println();
		
		System.out.println("Which percentage do increase salary? ");
		System.out.println();
		double percentagem = sc.nextDouble();
		employee.increase(percentagem);
		
		System.out.println("Update Data: " + employee.Name + ", $ "+ String.format("%.2f", employee.lSalary()));
		
		sc.close();

	}

}
