package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	System.out.println("Enter cliente data: ");
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("Email: ");
	String email = sc.nextLine();
	System.out.print("Birth date (DD/MM/YYYY): ");
	String birth = sc.next();
	LocalDate date = LocalDate.parse(birth, sdf); 
	
	Client client = new Client(name, email, date);
	
	//System.out.println(client); //SÓ PARA TESTAR SE FUNCIONAVA.
	
	System.out.println("Enter order data: ");
	System.out.print("Status: ");
	sc.nextLine();
	String status = sc.nextLine();
	System.out.print("How many items to this order? ");
	Integer n = sc.nextInt();
	Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status));
	
	//System.out.println(order); //SÓ PARA TESTAR SE FUNCIONAVA.
	
	for ( int i = 1; i <= n; i++) {
		System.out.println("Enter #" + i + "item data: ");
	
		
	}
	
	
	
	
	
	
	}
	
}
