package CS401_Assignment2_RubenPlascencia;
public class ShoppingCart2 extends Products {
	private ShoppingCart2 cart;
	double price;
	public ShoppingCart2(String identifier, double price) {
		super(identifier, price);
	}
	public ShoppingCart2 getCart() {
		return cart;
	}
	public void setCart(ShoppingCart2 cart) {
		this.cart = cart;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	boolean add(Products product) {
		return cart.add(product);
	}
	boolean remove(Products product) {
		cart.remove(product);
		return true;
	}
	public double totalCartValue() {
		double total = 0;
		for(int i = 0; i < 4; i++) {
			total += cart.getPrice();
		}
		return total;
	}
}