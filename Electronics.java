package CS401_Assignment2_RubenPlascencia;

public class Electronics extends Products{
	private String brand;
	private int warranty;
	
	public Electronics(String identifier, double price) {
		super(identifier, price);
	}
	public String getBrand() {
		return brand;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setWarranty(int warranty) {
		if (warranty > 0) {
			this.warranty = warranty;
		}
		else {
			System.out.println("Error!");
		}
	}
	@Override
	public void item() {
		System.out.println("The product is a Phone, Brand: Apple, Warranty: 1 Year");
	}
	public void cost() {
		System.out.println("The price of this product is: $345.65");
	}

}
