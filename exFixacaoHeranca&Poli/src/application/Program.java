package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Product #" + i +" data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(productType == 'i') {
				System.out.print("Customs fee: ");
				double costomsFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, costomsFee));
			}
			else if (productType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				
				list.add(new UsedProduct(name, price, LocalDate.parse(date, sdf)));
			}
			else {
				list.add(new Product(name, price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		
		for (Product prod: list) {
			System.out.println(prod.PriceTag());
		}
		
		
		
		sc.close();
	}

}
