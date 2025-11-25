package mainPackage;

import java.io.Serializable;

public class NonFiction implements Genre, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//reducing warning
	
	//Instance Variables
	private final String GENRE = "Non-Fiction";
	private String subGenre;
	private static double genreDiscount = 10;
	
	//Constructor
	public NonFiction(String subGenre) {
		this.subGenre = subGenre;
	}

	//Getters and Setters
	public void setGenreDiscount(double discount) {
		NonFiction.genreDiscount = discount;
	}
	
	//Implements of Method from Genre Interface
	@Override
	public double getGenreDiscount() {
		return genreDiscount;
	}
	
	@Override
	public String getSubGenre() {
		return subGenre;
	}

	@Override
	public void setSubGenre(String subGenre) {
		this.subGenre = subGenre;
	}

	@Override
	public String getGenre() {
		return GENRE;
	}
}
