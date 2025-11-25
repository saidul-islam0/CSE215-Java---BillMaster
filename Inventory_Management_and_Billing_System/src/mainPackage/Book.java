package mainPackage;

import java.io.Serializable;

public class Book implements Comparable<Book>, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//reducing warning
	
	//Instance Variables
	private String name;
	private double price;
	private Author writer;
	private double percentageDiscount;
	private Genre genre;
	private String isbn;
	private int yearOfPublish;
	
	//Constructor
	public Book(String name, double price, Author writer, double PercentageDiscount, Genre genre, String isbn, int yearOfPublish) {
		this.name=name;
		this.price=price;
		this.writer=writer;
		this.percentageDiscount=PercentageDiscount;
		this.genre=genre;
		this.isbn=isbn;
		this.yearOfPublish= yearOfPublish;	
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Author getWriter() {
		return writer;
	}
	
	public double getPercentageDiscount() {
		return percentageDiscount;
	}
	
	public void setPercentageDiscount(double discount) {
		this.percentageDiscount = discount;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public int getYearOfPublish() {
		return yearOfPublish;
	}
	
	@Override
	public String toString() {
		return "Book Name = " + name + "\nPrice = " + price + "\nWriter = " + writer + "\nPercentage Discount = "
				+ percentageDiscount + "\nGenre = " + genre.getGenre() + "\nISBN = " + isbn + "\nYear Of Publish = " + yearOfPublish;
	}

	@Override
	public int compareTo(Book book) {
		if(isbn.compareTo(book.getIsbn()) > 0)
			return 1;
		else if(isbn.compareTo(book.getIsbn()) == 0)
			return 0;
		else
			return -1;
	}
}
