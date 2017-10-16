package RelationshipBetweenClass;

import java.util.ArrayList;

/*
address aggregates Invoice
LineItem aggregates Invoice
Product aggregates LineItem
Invoice dependency Product*/
public class InvoicePrinter {
	public static void main(String args[]){
  Address a=new Address("roebuck","road","dublin");
  Invoice invoice=new Invoice(a);
  invoice.add(new Product("apple",50),5);
  invoice.add(new Product("orangge",10),2);
  invoice.add(new Product("wifi",5),1);
  System.out.println(invoice.format());
	}
}

class Invoice {
	private Address add;
	private ArrayList<LineItem> items;

	public Invoice(Address add) {
		items = new ArrayList<LineItem>();
		this.add = add;
	}

	public void add(Product p, int quantity) {
		LineItem i = new LineItem(quantity, p);
		items.add(i);
	}

	public double getAmountDue() {
		double p = 0;
		for (LineItem l : items) {
			p = p + l.getTotalPrice();
		}
		return p;
	}

	public String format() {
		String r = " I N V O I C E\n\n" + add.format()
				+ String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");
		for (LineItem l : items) {
			r += l.format() + "\n";
		}
		r += String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());
		return r;
	}
}

class Address {
	private String name;
	private String city;
	private String state;

	public Address(String name, String city, String state) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
	}

	public String format() {
		return "Address [name=" + name + ", city=" + city + ", state=" + state + "]";
	}

}

class LineItem {
	private int quantity;
	private Product product;

	public LineItem(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public String format() {
		return "LineItem [quantity=" + quantity + ", product=" + product + "]";
	}

	public double getTotalPrice() {
		return product.getPrice() * quantity;
	}
}

class Product {
	private String description;
	private double price;

	public Product(String description, double price) {
		super();
		this.description = description;
		this.price = price;
	}

	public String format() {
		return "Product [description=" + description + ", price=" + price + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}