package mainPackage;

import java.io.Serializable;

public class Author implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//reducing warning
	
	//Instance Variables
	private String name;
	private String emailId;
	private int age;
	private String gender;
	
	//Constructor
	public Author(String name, String emailId, int age, String gender) {
		this.name = name;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String email) {
		this.emailId = email;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ", " + age;
	}
}
