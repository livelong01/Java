package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContrat;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		// instanciando o trabalhador. Worklevel usou o valueof, pq precisa ser convertido em String.
		// para associar o departamento, precisar instanciar um NOVO objeto usando o dado que recebmos na variavel "DEPARTMENTNAME". 
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Enter contract #"+i+" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			String data1 = sc.next();
			LocalDate contractDate = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContrat contrat = new HourContrat(contractDate, valuePerHour, hours);
			worker.addContrat(contrat);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3)); // recorta 3 em diante.
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartmente().getName()); // atraves do worker, chega no departament e dele chega no nome do deparamente. ( ASSOCIACAO DA ASSOCIACAO // COMPOSICAO)
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)) );
		sc.close();
	}

}
