package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate manufactureDate;
	
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String PriceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName() + " (used) $ " + String.format("%.2f", super.getPrice()));
		sb.append(" (Manufactured date: " + manufactureDate.format(sdf) + ")" );
		return sb.toString();
	}
	
}
