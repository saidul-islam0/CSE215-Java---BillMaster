package helperPackage;

import mainPackage.Book;

public class BookList {
	public String getBookListWithPrice(Book[] books, int numberOfBooks) {
		String bookList = "";
		for(int i = 0; i < numberOfBooks; i++) {
			bookList = bookList.concat((i+1) + ". " + books[i].getName() + ": " + books[i].getPrice() + "\n");
		}
		return bookList;
	}
	
	public String getBookList(Book[] books, int numberOfBooks) {
		String bookList = "";
		for(int i = 0; i < numberOfBooks; i++) {
			bookList = bookList.concat((i+1) + ". " + books[i].getName() + "\n");
		}
		return bookList;
	}
	
	public String getBookListFullDetails(Book[] books, int numberOfBooks) {
		String bookList = "=========================\n";
		for(int i = 0; i < numberOfBooks; i++) {
			bookList = bookList.concat((i+1) + ".\n" +
					"Title: " + books[i].getName() +
					"\nWriter: " + books[i].getWriter().getName() +
					"\nGenre: " + books[i].getGenre().getGenre() +
					"\nSub Genre: " + books[i].getGenre().getSubGenre() +
					"\nISBN: " + books[i].getIsbn() +
					"\nYear of Publish: " + books[i].getYearOfPublish() +
					"\nPrice: " + books[i].getPrice() +
					"\nDiscount: " + books[i].getPercentageDiscount() + "%" +
					"\n=========================\n");
		}
		return bookList;
	}
	
	public String getBookListWithIndex(Book[] books, int numberOfBooks) {
		String bookList = "=========================\n";
		for(int i = 0; i < numberOfBooks; i++) {
			bookList = bookList.concat("Index: " + i + ".\n" +
					"Title: " + books[i].getName() +
					"\nWriter: " + books[i].getWriter().getName() +
					"\nGenre: " + books[i].getGenre().getGenre() +
					"\nSub Genre: " + books[i].getGenre().getSubGenre() +
					"\nISBN: " + books[i].getIsbn() +
					"\nYear of Publish: " + books[i].getYearOfPublish() +
					"\nPrice: " + books[i].getPrice() +
					"\nDiscount: " + books[i].getPercentageDiscount() + "%" +
					"\n=========================\n");
		}
		return bookList;
	}
	
	
}
