package helperPackage;

import mainPackage.Book;

public class MergeSort {
	public void sortByYearOfPublish(Book[] books, int numberOfBooks) {
			if(numberOfBooks < 2)
				return;
			int middleIndex = numberOfBooks / 2;
			
			Book[] leftBooks = new Book[middleIndex];
			for(int i = 0; i < middleIndex; i++)
				leftBooks[i] = books[i];
			
			Book[] rightBooks = new Book[numberOfBooks - middleIndex];
			for(int i = middleIndex; i < numberOfBooks; i++)
				rightBooks[i - middleIndex] = books[i];
			
			sortByYearOfPublish(leftBooks, leftBooks.length);
			sortByYearOfPublish(rightBooks, rightBooks.length);
			
			mergeByYearOfPublish(leftBooks, rightBooks, books);
	}
	
	private void mergeByYearOfPublish(Book[] leftBooks, Book[] rightBooks, Book[] books) {
		int i = 0, j = 0, k = 0;
		
		while(i < leftBooks.length && j < rightBooks.length) {
			if(leftBooks[i].getYearOfPublish() <= rightBooks[j].getYearOfPublish())
				books[k++] = leftBooks[i++];
			else
				books[k++] = rightBooks[j++];
		}
		
		while(i < leftBooks.length)
			books[k++] = leftBooks[i++];
		
		while(j < rightBooks.length)
			books[k++] = rightBooks[j++];
	}
	
	public void sortByPrice(Book[] books, int numberOfBooks) {
		if(numberOfBooks < 2)
			return;
		int middleIndex = numberOfBooks / 2;
		
		Book[] leftBooks = new Book[middleIndex];
		for(int i = 0; i < middleIndex; i++)
			leftBooks[i] = books[i];
		
		Book[] rightBooks = new Book[numberOfBooks - middleIndex];
		for(int i = middleIndex; i < numberOfBooks; i++)
			rightBooks[i - middleIndex] = books[i];
		
		sortByPrice(leftBooks, leftBooks.length);
		sortByPrice(rightBooks, rightBooks.length);
		
		mergeByPrice(leftBooks, rightBooks, books);
	}
	
	private void mergeByPrice(Book[] leftBooks, Book[] rightBooks, Book[] books) {
		int i = 0, j = 0, k = 0;
		
		while(i < leftBooks.length && j < rightBooks.length) {
			if(leftBooks[i].getPrice() <= rightBooks[j].getPrice())
				books[k++] = leftBooks[i++];
			else
				books[k++] = rightBooks[j++];
		}
		
		while(i < leftBooks.length)
			books[k++] = leftBooks[i++];
		
		while(j < rightBooks.length)
			books[k++] = rightBooks[j++];
	}
}
