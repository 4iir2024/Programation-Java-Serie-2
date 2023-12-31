package ex1;

public class Book extends Author {
	
	private String name;
	private Author author;
	private double price;
	private int qty = 0;
	
	
	
	public Book()
	{
		
	}

	public Book(String name, Author author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	




	public Book(String name, Author author, double price, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public Author getAuthor() {
		return author;
	}






	public void setAuthor(Author author) {
		this.author = author;
	}






	public double getPrice() {
		return price;
	}






	public void setPrice(double price) {
		this.price = price;
	}






	public int getQty() {
		return qty;
	}






	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	






	@Override
	public String toString() {
		return "Book informations is  name : " + name + ", author : " + author + ", price : " + price + ", qty : " + qty ;
	}






	public static void main(String[] args) {
		Author a1 = new Author("Alen","alenlex@grex.ca",'m');
		
		Book b1 = new Book("Nord",a1,34.33,3);
		
		System.out.println(b1.toString());

	}

}
