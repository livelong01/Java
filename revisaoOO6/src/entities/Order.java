package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	DateTimeFormatter sdf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDateTime moment;
	
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	public Order() {
		
	}
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem (OrderItem item) {
		items.add(item);
	}
	
	public void removeItem (OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		for (OrderItem x: items) {
			sum += x.subTotal();
			}
		return sum;
	}
	
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + sdf2.format(client.getBirthDate()) 
		+") - " + client.getEmail() + "\n" );
		sb.append("Order items:" + "\n");
		
		for (OrderItem x: items) {
			sb.append(x.getProduct().getName() 
					+ " $" 
					+ x.getPrice() 
					+ ", Quantity: " 
					+ x.getQuantity()
					+ ", Subtotal: $"
					+ String.format("%.2f", x.subTotal()) + "\n");
		}
		
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
	
}
