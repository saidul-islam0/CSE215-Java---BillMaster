package mainPackage;

import java.io.Serializable;
import java.util.Arrays;

import helperPackage.BookList;
import helperPackage.MergeSort;

public class BookCollection implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//reducing warning
	
	//Instance Variables
	private Book[] books;
	private int numberOfBooks;
	private int MAX_SIZE = 10000;
	
	//Constructor
	public BookCollection() {
		books = new Book[MAX_SIZE];
		numberOfBooks = 0;
	}
	
	public boolean addBook(Book book) {
		if(numberOfBooks < MAX_SIZE) {
			books[numberOfBooks++] = book;
			return true;			
		}
		else
			return false;
	}
	
	public boolean removeBook(int index) {
		if(index < numberOfBooks && index >= 0) {
			for(int i = index; i < numberOfBooks - 1; i++) {
				books[i] = books[i+1];
			}
			books[(numberOfBooks--)-1] = null;
			return true;
		}
		else
			return false;
	}
	
	public Book getBook(String isbn) {
		int i;
		Book book = null;
		for(i = 0; i < numberOfBooks; i++) {
			if(books[i].getIsbn().equals(isbn)) {
				book = books[i];
				removeBook(i);
				break;
			}
		}
		return book;
	}
	
	//Helper Method for accessing books info
	public Book accessBook(int index) {
		if(index < numberOfBooks)
			return books[index];
		return null;
	}
	
	public int searchBook(String isbn) {
		int i;
		for(i = 0; i < numberOfBooks; i++) {
			if(books[i].getIsbn().equals(isbn)) {
				break;
			}
		}
		return i;
	}
	
	public boolean replaceBook(Book book, int index) {
		if(index < numberOfBooks && index >= 0) {
			books[index] = book;
			return true;
		}
		return false;
	}
	
	public String printBookInfo(Book book) {
		int i;
		for(i = 0; i < numberOfBooks; i++) {
			if(books[i].equals(book)) {
				break;
			}
		}
		return books[i].toString();
	}
	
	public Book[] getBookCollection() {
		return books;
	}
	
	public void resetBooks() {
		books = new Book[MAX_SIZE];
		numberOfBooks = 0;
	}
	
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	
	public void sortByIsbn() {
		Book[] tempBooks = new Book[numberOfBooks];
		for(int i = 0; i < numberOfBooks; i++) {
			tempBooks[i] = books[i];
		}
		
		Arrays.sort(tempBooks);
		
		for(int i = 0; i < numberOfBooks; i++) {
			books[i] = tempBooks[i];
		}
	}
	
	public void sortByYearOfPublish() {
		new MergeSort().sortByYearOfPublish(books, numberOfBooks);
	}
	
	public void sortByPrice() {
		new MergeSort().sortByPrice(books, numberOfBooks);
	}

	@Override
	public String toString() {
		return new BookList().getBookList(books, numberOfBooks);
	}
}
