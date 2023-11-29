package ex2;

public class Book {
	
	private String Title ;
	private String Author ;
	private double Price ;
	private int nbPages;
	
	public static double nbBook;
	public static double pMax, pMin;
	
	public Book()
	{
		
	}
	
	
	

	public Book(String title, String author, double price, int nbPages) {
		super();
		Title = title;
		Author = author;
		Price = price;
		this.nbPages = nbPages;
		
		Book.nbBook++;
		if(nbBook ==1) pMax = pMin = price;
		else {
			if(pMax<price) pMax=price;
			if(pMin>price) pMin=price;
		}
	}
	
	
	@Override
	public String toString() {
		return "Book informations => Title=" + Title + ", Author=" + Author + ", Price=" + Price + ", nbPages=" + nbPages ;
	}

	
	



	public String getTitle() {
		return Title;
	}




	public void setTitle(String title) {
		Title = title;
	}




	public String getAuthor() {
		return Author;
	}




	public void setAuthor(String author) {
		Author = author;
	}




	public double getPrice() {
		return Price;
	}




	public void setPrice(double price) {
		Price = price;
	}




	public int getNbPages() {
		return nbPages;
	}




	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}




	public static void main(String[] args) {
		Book [] listBook = new  Book[10];
		
		for(int i = 0;i<listBook.length;i++)
			listBook[i] = new Book("title"+i, "author"+i,Math.random()*1000,(int)(Math.random()*1000));
		
		for(Book book:listBook)
			book.toString();
		
		System.out.println(Book.nbBook);
		System.out.println(Book.pMax);
		System.out.println(Book.pMin);

	}

}
