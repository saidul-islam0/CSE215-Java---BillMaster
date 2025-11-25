package mainPackage;

import java.io.Serializable;

public class Fiction implements Genre, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//reducing warning
	
	//Instance Variables
	private final String GENRE = "Fiction";
	private String subGenre;
	private static double genreDiscount = 9;
	
	//Constructor
	public Fiction(String subGenre) {
		this.subGenre = subGenre;
	}

	//Getters and Setters
	public void setGenreDiscount(double discount) {
		Fiction.genreDiscount = discount;
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
