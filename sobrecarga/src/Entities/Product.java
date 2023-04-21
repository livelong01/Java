package Entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// TODOS OS CONSTRUTORES PODEM SER USADOS AO MSM TEMPO.
	// sobrecarga com constru padrao //
	public Product () {
		
	}
	
	// CONSTRUTOR personalizado ( com variaveis) //
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price ;
		this.quantity = quantity;
	}
	// FIM DO CONSTRUTOR // sobrecarga
	
	public Product (String name, double price) {
		this.name = name;
		this.price = price ;
	}
		// fim sobrecarga

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}