package CS401_Assignment2_RubenPlascencia;

public class Main extends Products {

	public Main(String identifier, double price, ShoppingCart2 cart) {
		super(identifier, price);
	}

	public static void main(String[] args) {
		Books books = new Books("To Kill a Mocking Bird", 19.50);
		Clothing clothing = new Clothing("Small Shirt", 35.89);
		Electronics electronics = new Electronics("IPhone", 345.65);
		ShoppingCart2 cart = new ShoppingCart2(identifier, price);
		System.out.println("The total cart value is: \t" +cart.totalCartValue());
	}

}
