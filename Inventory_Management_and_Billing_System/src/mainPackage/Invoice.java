package mainPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import helperPackage.BookList;

public class Invoice {
	
	//Instance Variables
	private Book[] books;
	private LocalDateTime date;
	private int numberOfBooks;
	private static String authorName;//for storing author name if author discount available

	//Constructor
	public Invoice() {
		books = new Book[1000];
		date = LocalDateTime.now();
		this.numberOfBooks = 0;
	}
	
	public Book[] getBook() {
		return books;
	}
	
	public String getDateTime() {
		return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
	}
	
	//for making file name format. file name does not allow ':'
	public String getDateTimeFile() {
		return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss"));
	}
	
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	
	public void addBook(Book book) {
		books[numberOfBooks++] = book;
	}
	
	public double getFinalPrice() {
		double minimum = (calculateAuthorDiscountPrice() < calculateGenreDiscountPrice()) ? calculateAuthorDiscountPrice():calculateGenreDiscountPrice();
		return (minimum < calculateBookDiscountPrice()) ? minimum:calculateBookDiscountPrice();
	}
	
	public double calculatePrice() {
		double price = 0.0;
		for(int i = 0; i < numberOfBooks; i++) {
			price += books[i].getPrice();
		}
		return price;
	}
	
	public double calculateAuthorDiscountPrice() {
		if(isAuthorDiscountEligible()) {
			double price = 0.0;
			for(int i = 0; i < numberOfBooks; i++) {
				if(books[i].getWriter().getName().equals(authorName)) {
					price = price + (books[i].getPrice() - (books[i].getPrice() * 45) / 100.0);
				}
				else {
					price += books[i].getPrice();
				}
			}
			return price;
		}
		else
			return calculatePrice();
	}
	
	public double calculateBookDiscountPrice() {
		double price = 0.0;
		for(int i = 0; i < numberOfBooks; i++) {
			price = price + (books[i].getPrice() - (books[i].getPrice() * books[i].getPercentageDiscount() / 100.0));
		}
		return price;
	}
	
	public double calculateGenreDiscountPrice() {
		double price = 0.0;
		for(int i = 0; i < numberOfBooks; i++) {
			price = price + (books[i].getPrice() - (books[i].getPrice() * books[i].getGenre().getGenreDiscount() / 100.0));
		}
		return price;
	}
	
	public boolean isAuthorDiscountEligible() {
		String[] authors = new String[numberOfBooks];
		int[] count = new int[numberOfBooks];
		int numberOfUniqueAuthors = 0, i, j;
		boolean flag = false;
		for(i = 0; i < numberOfBooks; i++) {
			flag = true;
			for(j = 0; j < numberOfUniqueAuthors; j++) {
				if(books[i].getWriter().getName().equals(authors[j])) {
					flag = false;
					break;
				}
			}
			if(flag) {
				authors[numberOfUniqueAuthors] = books[i].getWriter().getName();
				count[numberOfUniqueAuthors++]++;
			}
			else {
				count[j]++;
				if(count[j] >= 3) {
					authorName = authors[j];
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		BookList bookList = new BookList();
		return "Purchase Date: " + getDateTime() +
				"\n" + bookList.getBookListWithPrice(books, numberOfBooks) + 
				"Price: " + calculatePrice() +
				"\nPrice after Discount: " + getFinalPrice();
	}
	
}
