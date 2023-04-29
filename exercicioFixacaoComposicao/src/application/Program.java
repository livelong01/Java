package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

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
	OrderStatus status = OrderStatus.valueOf(sc.next());
	System.out.print("How many items to this order? ");
	Integer n = sc.nextInt();
	
	Order order = new Order(LocalDateTime.now(), status, client);
	
	//System.out.println(order); //SÓ PARA TESTAR SE FUNCIONAVA.
	
	for ( int i = 1; i <= n; i++) {
		System.out.println("Enter #" + i + " item data: ");
		System.out.print("Product Name: ");
		sc.nextLine();
		String productName = sc.nextLine();
		System.out.print("Product Price: ");
		Double price = sc.nextDouble();
		
		Product product = new Product(productName, price);
		
		System.out.print("Quantity: ");
		Integer quantity = sc.nextInt();
		
		OrderItem orderItem = new OrderItem(quantity, price, product);
		
		order.addItem(orderItem);
	}
	
	System.out.println();
	System.out.println(order);
		 
		 sc.close();
	}
	
	
	
	
	
	
	}
	
