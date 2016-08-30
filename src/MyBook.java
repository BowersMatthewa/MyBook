//-----------------------------------------------------------
//MyBook.java					Author: Matthew Bowers
//VCU Engineering CMSC 256		Date: 8/26/16
//
//A class to represent the identifying information about 
//a book.
//-----------------------------------------------------------

import java.util.regex.Pattern;
import java.lang;

public class MyBook 
{
	private String title, authorFirstName, authorLastName, isbn10, isbn13;
	
	public MyBook()
	{
		title = "None Given";
		authorFirstName = "None Given";
		authorLastName = "None Given";
		isbn10 = "None Given";
		isbn13 = "None given";
	}
	
	public	MyBook(String title, String	authorFirstName, String authorLastName,	
			String isbn10, String isbn13)
	{
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		setIsbn10(isbn10);
		setIsbn13(isbn13);
	}
	
	//getters for each variable
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthorFirstName()
	{
		return authorFirstName;
	}
	
	public String getAuthorLastName()
	{
		return authorLastName;
	}
	
	public String getIsbn10()
	{
		return isbn10;
	}
	
	public String getIsbn13()
	{
		return isbn13;
	}
	
	//setters for each variable
	
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	
	public void setAuthorLastName(String newLastName)
	{
		authorLastName = newLastName;
	}
	
	public void setAuthorFirstName(String newFirstName)
	{
		authorFirstName = newFirstName;
	}
	
	public void setIsbn10(String newIsbn10) throws IllegalArgumentException
	{
		//makes sure what is left is a 10 digit number
		if(newIsbn10.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d"))
			isbn10 = newIsbn10;
		else 
			throw new IllegalArgumentException("Expected 10 digit number for isbn10.");
	}
	
	public void setIsbn13(String newIsbn13) throws IllegalArgumentException
	{
		//makes sure what is left is a 13 digit number
		if(newIsbn13.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d"))
			isbn13 = newIsbn13;
		else 
			throw new IllegalArgumentException("Expected 13 digit number for isbn13.");
	}
	
	//checks to see if two Objects are the same book
	public boolean equals(Object otherBook)
	{
		boolean result = false;
		
		//if the other object is not an instance of MyBook return false
		if (!(otherBook instanceof MyBook))
			result = false;
		//if the other object is the same object return true
		else if(this == otherBook)
			result = true;
		//failing that check that each piece of instance data is the same
		else if((title.equals(((MyBook)otherBook).getTitle())))
			if((authorLastName.equals(((MyBook)otherBook).getAuthorLastName())))
				if((authorFirstName.equals(((MyBook)otherBook).getAuthorFirstName())))
					if((isbn10.equals(((MyBook)otherBook).getIsbn10())))
						if((isbn13.equals(((MyBook)otherBook).getIsbn13())))
							result = true;
		
		return result;
	}
	
	//returns a formatted string with the instance data
	public String toString()
	{
		String bookAsString = title + "/nAuthor: " + authorLastName + ", " + authorFirstName + 
				"/nISBN10: " + isbn10 + "/nISBN13: " + isbn13;
		
		return bookAsString;
	}
	
}
