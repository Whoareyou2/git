package com.course.books;

public class Author
{
	//
	// Attributes
	//
	private String name = "--undefined--";
	private String email = "--undefined--";
	private char gender = 'U';
	
	//
	// Constru	ctors
	//
	public Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		
		// Note - we always need to defend the integrity of our class
		if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')
		{
			this.gender = gender;
		}
	}
	
	//
	// Functions
	//
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public void setEmail(String email)
	{
		// TODO: check that the email valid
		if (email.contains("@"))
		{
			this.email = email;
		}
	}
	
	
	
	public String toString()
	{
		return name + "(" + gender + ") at " + email;
	}
}
