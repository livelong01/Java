package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		
		List<Empregados> emp = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n ; i++) {
			System.out.println("Emplyoee #" + (i+1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			emp.add(new Empregados(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int codeId = sc.nextInt();
		Empregados busca = emp.stream().filter(x -> x.getId()  == codeId).findFirst().orElse(null);
		
		if ( busca != null ) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			busca.increaseSalary(percentage);
			
		}
		else {
			System.out.println("This id does not exist! ");
		}
		System.out.println();
		
		System.out.println("List of employees: ");
		for (Empregados obj: emp) {
			System.out.println(obj);
		}
		
		

		sc.close();
	}

}
