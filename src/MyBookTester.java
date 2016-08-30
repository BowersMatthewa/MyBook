
public class MyBookTester 
{
	public static void main(String args[])
	{
		getHeader();
		
		System.out.println("Testing default constructor");
		MyBook book0 = new MyBook();
		
		System.out.println("\nTesting toString");
		System.out.println(book0);		
		
		System.out.println("Testing setIsbn10");
		System.out.println("setting isbn10 to o123456789.");
		try{
			book0.setIsbn10("o123456789");
		}catch(IllegalArgumentException exception){
			exception.printStackTrace();
		}
		System.out.println("setting isbn10 to 0123456789.");
		try{
			book0.setIsbn10("0123456789");
		}catch(IllegalArgumentException exception){
			exception.printStackTrace();
		}
		System.out.println(book0);
		System.out.println("setting isbn10 to 012345678.");
		try{
			book0.setIsbn10("012345678");
		}catch(IllegalArgumentException exception){
			exception.printStackTrace();
		}
		
		System.out.println("\nTesting setIsbn13");
		System.out.println("setting isbn13 to o123456789012.");
		try{
			book0.setIsbn13("o123456789012");
		}catch(IllegalArgumentException exception){
			exception.printStackTrace();
		}
		System.out.println("setting isbn13 to 0123456789012.");
		try{
			book0.setIsbn13("0123456789012");
		}catch(IllegalArgumentException exception){
			exception.printStackTrace();
		}
		System.out.println(book0);
		System.out.println("setting isbn13 to 012345678.");
		try{
			book0.setIsbn13("012345678");
		}catch(IllegalArgumentException exception){
			exception.printStackTrace();
		}
		
		System.out.println("\nTesting overload constructor");
		MyBook book1 = new MyBook("Book1", "Matthew", "Bowers", "0123456789", "0123456789012");
		System.out.println(book1);
		
		
		System.out.println("\nTesting setAuthorFirstName and setAuthorLastName");
		book1.setAuthorFirstName("Bob");
		System.out.println("Author should now display as \"Bowers, Bob\"");
		System.out.println(book1);
		book1.setAuthorLastName("Franks");
		System.out.println("\nAuthor should now display as \"Franks, Bob\"");
		System.out.println(book1);
		
		System.out.println("\nTesting setTitle");
		book1.setTitle("A new day, A new Title");
		System.out.println("Title should now display as \"A new day, A new Title\"");
		System.out.println(book1);
		
		System.out.println("\nTesting equals for reflexivity");
		if(book1.equals(book1))
			System.out.println("book1 == book1. equals() is reflexive.");
		else
			System.out.println("book1 ~= book1. equals() is not reflexive.");
		
		System.out.println("\nTesting equals with different books");
		System.out.println("the first book:\n" + book0);
		System.out.println("the second book:\n" + book1);
		checkSymmetry(book0, book1);
		
		System.out.println("\nTesting equals with 2 default books");
		System.out.println("Generating 2 new Books...");
		MyBook book2 = new MyBook();
		MyBook book3 = new MyBook();
		System.out.println("the first book:\n" + book2);
		System.out.println("the second book:\n" + book3);
		System.out.println("Checking if they are the same...");
		checkSymmetry(book2, book3);
		
		System.out.println("\nTesting equals with 2 constructed books with the same asset values");
		System.out.println("Generating 2 books");
		book0 = new MyBook("title", "Matthew", "Bowers", "0123456789", "0123456789012");
		book1 = new MyBook("title", "Matthew", "Bowers", "0123456789", "0123456789012");
		System.out.println("the first book:\n" + book0);
		System.out.println("the second book:\n" + book1);
		System.out.println("Checking if they are the same...");
		checkSymmetry(book0, book1);
		
		System.out.println("\nRepeat but change title");
		book0.setTitle("newTitle");
		System.out.println("the first book:\n" + book0);
		System.out.println("the second book:\n" + book1);
		checkSymmetry(book0, book1);
		
		System.out.println("\nPut the title back change authorFirstName");
		book0.setTitle("title");
		book0.setAuthorFirstName("Bob");
		System.out.println("the first book:\n" + book0);
		System.out.println("the second book:\n" + book1);
		checkSymmetry(book0, book1);
		
		System.out.println("\nput first name back change last name");
		book0.setAuthorFirstName("Matthew");
		book0.setAuthorLastName("Franks");
		System.out.println("the first book:\n" + book0);
		System.out.println("the second book:\n" + book1);
		checkSymmetry(book0, book1);
		
		System.out.println("\nput last name back change isbn10");
		book0.setAuthorLastName("Bowers");
		book0.setIsbn10("1234567890");
		System.out.println("the first book:\n" + book0);
		System.out.println("the second book:\n" + book1);
		checkSymmetry(book0, book1);
		
		System.out.println("\nput isbn10 back change isbn13");
		book0.setIsbn10("0123456789");
		book0.setIsbn13("1234567890123");
		System.out.println("the first book:\n" + book0);
		System.out.println("the second book:\n" + book1);
		checkSymmetry(book0, book1);
	}
	
	private static void getHeader()
	{
		System.out.println("Matthew Bowers");
		System.out.println("CMSC 256 Programming Project 1 - MyBook");
		System.out.println("This program consists of a simple class which represents and stores "
				+ "the title, author, and isbn numbers for the book. \nMethods are included" +
				" to set and get each of these variables.");
	}
	
	private static void checkSymmetry(MyBook book0, MyBook book1)
	{
		if(book0.equals(book1))
			System.out.println("the first book is the same book as the second book");
		else
			System.out.println("the first book is not the same book as the second book");
		//Symmetry 
		if(book1.equals(book0))
			System.out.println("the second book is the same book as the first book");
		else
			System.out.println("the second book is not the same book as the first book");
	}
}
