package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// criar a lista com instancia do objeto employee
		List<Employee> list = new ArrayList<>();
		

		// inicio do programa // 
		System.out.print("How many employees will be registered? ");
		int manyEmp = sc.nextInt();
		
		// for para repeticao
		
		for (int i = 0; i < manyEmp; i ++) {
			System.out.println("Emplyoee #"+ (i+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine(); // consumir o "Enter" da memoria
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			// instanciar um obj com lista ainda no for.
			
			//Employee emp = new Employee(id, name, salary); (joguei dentro do list.add ao inves de nomear uma classe
			list.add(new Employee(id, name, salary)); // adc o id, name e salario na lista.
			}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);	
		}
		System.out.println();
		System.out.println("List of employees: ");
		
		// ler a lsita de forma nova.
		
		for (Employee x : list) { // instanciar o objeto x e printar ele.
			System.out.println(x);
		}
		sc.close();

	}

}
