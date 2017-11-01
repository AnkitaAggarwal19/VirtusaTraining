//package day4;
import java.util.*;

public class Invoice {
	
	String name, description;
	int quantity_of_item;
	double price_per_item;
	
	Invoice()
	{
		name = null;
		description = null;
		quantity_of_item = 0;
		price_per_item = 0.0;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getQuantity_of_item() {
		return quantity_of_item;
	}


	public void setQuantity_of_item(int quantity_of_item) {
		this.quantity_of_item = quantity_of_item;
	}


	public double getPrice_per_item() {
		return price_per_item;
	}


	public void setPrice_per_item(double price_per_item) {
		this.price_per_item = price_per_item;
	}
	
	public double getInvoiceAmount() {
		if (quantity_of_item < 0)
			quantity_of_item = 0;
		
		if(price_per_item < 0)
			price_per_item = 0.0;
		
		double InvoiceAmount = quantity_of_item * price_per_item;
		
		return 2 * InvoiceAmount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Invoice obj = new Invoice();
		
		System.out.println("Enter the product name");
		String name = scan.next();
		scan.nextLine();
		
		System.out.println("Write the description of the product");
		String description = scan.nextLine();
		
		System.out.println("Enter the quantity");
		int quantity = scan.nextInt();
		
		System.out.println("Enter price per item");
		double price = scan.nextDouble();
		
		obj.setName(name);
		obj.setDescription(description);
		obj.setQuantity_of_item(quantity);
		obj.setPrice_per_item(price);
		
		System.out.println("Name of the product is " + obj.getName());
		System.out.println("Amount is " + obj.getInvoiceAmount());

	}

}

