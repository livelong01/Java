package Entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
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
		// fim construtor
	
	//por conversao sao colocados apos os construtores.
	
	public void setName(String name) { // aqui voce pode MODIFICAR a variavel name
		this.name = name;
	}
	
	public String getName() { // aqui voce pode CHAMAR a variavel name
		return name;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	public double getPrice () {
		return price;
	}
	
	public int getQuantity () { // a quantidade so pode ser alterada pelas funcoes abaixo, para proteger o programa e a emrpesa.
		return quantity;
	}
	
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