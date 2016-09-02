//-----------------------------------------------------------
//MyBook.java					Author: Matthew Bowers
//VCU Engineering CMSC 256		Date: 8/26/16
//
//A class to represent the identifying information about 
//a book.
//-----------------------------------------------------------


public class MyBook 
{
	private String title, authorFirstName, authorLastName, isbn10, isbn13;
	
	public MyBook()
	{
		title = "None Given";
		authorFirstName = "None Given";
		authorLastName = "None Given";
		isbn10 = "0000000000";
		isbn13 = "0000000000000";
	}
	
	public	MyBook(String title, String	authorFirstName, String authorLastName,	
			String isbn10, String isbn13)
	{
		//setters used so that appropriate exceptions will be thrown
		setTitle(title);
		setAuthorFirstName(authorFirstName);
		setAuthorLastName(authorLastName);
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
	
	public void setTitle(String newTitle) throws IllegalArgumentException
	{
		if(newTitle != null)
			title = newTitle;
		else
			throw new IllegalArgumentException("Title may not be null");
	}
	
	public void setAuthorLastName(String newLastName) throws IllegalArgumentException
	{
		if(newLastName != null)
			authorLastName = newLastName;
		else
			throw new IllegalArgumentException("AuthorLastName may not be null");
	}
	
	public void setAuthorFirstName(String newFirstName) throws IllegalArgumentException
	{
		if(newFirstName != null)
			authorFirstName = newFirstName;
		else
			throw new IllegalArgumentException("AuthorFirstName may not be null");
	}
	
	public void setIsbn10(String newIsbn10) throws IllegalArgumentException
	{
		//makes sure what is left is a 10 digit number
		if(newIsbn10 != null)
			if(newIsbn10.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d"))
				isbn10 = newIsbn10;
			else 
				throw new IllegalArgumentException("ISBN10 must be a 10 digit number.");
		else
			throw new IllegalArgumentException("ISBN10 must not be null");
	}
	
	public void setIsbn13(String newIsbn13) throws IllegalArgumentException
	{
		//makes sure what is left is a 13 digit number
		if(newIsbn13 != null)
			if(newIsbn13.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d"))
				isbn13 = newIsbn13;
			else 
				throw new IllegalArgumentException("ISBN13 must be a 13 digit number.");
		else
			throw new IllegalArgumentException("ISBN13 must not be null");
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
		else if((isbn10.equals(((MyBook)otherBook).getIsbn10())))
			if((isbn13.equals(((MyBook)otherBook).getIsbn13())))
				result = true;
		return result;
	}
	
	//returns a formatted string with the instance data
	public String toString()
	{
		String bookAsString = "Title: " + title + "\nAuthor: " + authorLastName + ", " + authorFirstName + 
				"\nISBN10: " + isbn10 + "\nISBN13: " + isbn13;
		
		return bookAsString;
	}
	
}
