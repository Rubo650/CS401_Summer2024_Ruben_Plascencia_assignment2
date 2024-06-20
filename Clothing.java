package CS401_Assignment2_RubenPlascencia;

public class Clothing extends Products {
	private double size;
	private String material;
	
	public Clothing(String identifier, double price) {
		super(identifier, price);
	}
	public double getSize() {
		return size;
	}
	public String getMaterial() {
		return material;
	}
	public void setSize(double size) {
		if (size > 0.00) {
			this.size = size;
		}
		else {
			System.out.println("Error1");
		}
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public void item () {
		System.out.println("The product is a Shirt, Size: Small, Material: Cotton");
	}
	@Override
	public void cost() {
		System.out.println("The price of this product is: $35.89");
	}

}
