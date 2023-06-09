package domain;
public class Product {
	private String name;
	private double price;
	private String category;

	public Product() {
		//To-DO
	}
	
	
	
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-10.2f%-10s",this.getName(),this.getPrice(), this.getCategory());
	}



	
	

}
