package CS401_Assignment2_RubenPlascencia;

public class Products {
	protected static String identifier;
	protected String product;
	protected static double price;
	
	public Products(String identifier, double price) {
		this.identifier = identifier;
		this.price = price;
	}
	public void item() {
		System.out.println("The product is:");
	}
	public void cost() {
		System.out.println("The price of this product is:" );
	}
	public String getIdentifier() {
		return identifier;
	}
	public String getProduct() {
		return product;
	}
	public double getPrice() {
		return price;
	}
	public void setIdentifier(String identifier) {
		this.identifier =identifier;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public void setPrice(double price) {
		if (price > 0.00) {
			this.price = price;
		}
		else {
			System.out.println("Error!");
		}
		
	}
}
