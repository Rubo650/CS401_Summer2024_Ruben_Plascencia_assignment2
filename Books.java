package CS401_Assignment2_RubenPlascencia;

public class Books extends Products {
	private String author;
	private String genre;

	public Books(String identifier, double price) {
		super(identifier, price);
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public void item() {
		System.out.println("The product is a Book called: To Kill a Mocking Bird, By: Harper Lee, Genre: Novel ");
	}
	@Override
	public void cost() {
		System.out.println("The price of this product is: $19.50");
	}
}
