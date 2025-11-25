package mainPackage;

public interface Genre {
	
	//Implemented in Fiction and NonFiction Class
	double getGenreDiscount();
	String getSubGenre();
	void setSubGenre(String subGenre);
	String getGenre();
}
