
public class MyBookTester 
{
	public static void main(String args[])
	{
		getHeader();
		
		MyBook[] books = new MyBook[20];
		int i = 0;
		
		System.out.println("\nConstructor testing. Also tests set methods.");
		System.out.println("Testing default constructor and toString");
		books[i++] = new MyBook();
		System.out.println(books[0]);
		System.out.println("New Book created without error.");
		try{
			System.out.println("\nTesting constructor with allowable parameters");
			books[i++] = new MyBook("The Way of Kings", "Brandon", "Sanderson", "0765365278", "9780765365279");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with identical allowable parameters");
			books[i++] = new MyBook("The Way of Kings", "Brandon", "Sanderson", "0765365278", "9780765365279");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with allowable parameters");
			books[i++] = new MyBook("Words of Radiance", "Brandon", "Sanderson", "0575093323", "9780765365286");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with allowable parameters");
			books[i++] = new MyBook("Watership Down", "Richard", "Adams", "0380002930", "9780743277709");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with null title");
			books[i++] = new MyBook(null, "Richard", "Adams", "0380002930", "9780743277709");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with null first name");
			books[i++] = new MyBook("Watership Down", null, "Adams", "0380002930", "9780743277709");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with null last name");
			books[i++] = new MyBook("Watership Down", "Richard", null, "0380002930", "9780743277709");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with null ISBN10");
			books[i++] = new MyBook("Watership Down", "Richard", "Adams", null, "9780743277709");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with short ISBN10");
			books[i++] = new MyBook("Watership Down", "Richard", "Adams", "123456789", "9780743277709");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with long ISBN10");
			books[i++] = new MyBook("Watership Down", "Richard", "Adams", "12345678900", "9780743277709");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with letter in ISBN10");
			books[i++] = new MyBook("Watership Down", "Richard", "Adams", "asdfghjklq", "9780743277709");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with null ISBN13");
			books[i++] = new MyBook("Watership Down", "Richard", "Adams", "1234567890", null);
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with short ISBN13");
			books[i++] = new MyBook("Watership Down", "Richard", "Adams", "1234567890", "978074327770");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with long ISBN13");
			books[i++] = new MyBook("Watership Down", "Richard", "Adams", "1234567890", "978074327770123");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		try{
			System.out.println("\nTesting constructor with letter in ISBN13");
			books[i++] = new MyBook("Watership Down", "Richard", "Adams", "1234567890", "asdfghjklqwer");
			System.out.println(books[i - 1] + " created without error.");
		}catch(IllegalArgumentException exception){
			System.out.println("exception found");
			System.out.println(exception.getMessage());
		}
		
		System.out.println("\nTesting equals method. \nTesting reflexivity.");
		MyBook book0 = books[1];
		MyBook book1 = books[2];
		
		test(book0, book1);
		
		System.out.println("\nTesting equals method on 2 identical books");
		test(book0, book1);
		
		System.out.println("\nTesting equals method on aliases");
		book1 = book0;
		test(book0, book1);
		
		System.out.println("\nTesting equals on 2 entirely different books.");
		book0 = books[0];
		book1 = books[1];
		test(book0, book1);
		
		System.out.println("\nTesting equals on 2 books with identical information but different titles.");
		System.out.println("Also testing getTitle.");
		book0 = books[1];
		book1 = books[2];
		book1.setTitle(books[3].getTitle());
		test(book0, book1);
		System.out.println("Resetting title...");
		book1.setTitle("Way of Kings");
		
		System.out.println("\nTesting equals on 2 books with identical information but different FirstName.");
		System.out.println("Also testing getAuthorFirstName");
		book0 = books[1];
		book1 = books[2];
		book1.setAuthorFirstName(books[4].getAuthorFirstName());
		test(book0, book1);
		System.out.println("Even though " + book0.getTitle() + " was written by: " + book0.getAuthorFirstName() + " "
				+ book0.getAuthorLastName() + " and " + book1.getTitle() + " was written by: " + book1.getAuthorFirstName()
				+ " " + book1.getAuthorLastName());
		System.out.println("Resetting author name...");
		book1.setAuthorFirstName("Brandon");
		
		System.out.println("\nTesting equals on 2 books with identical information but differnt LastName");
		System.out.println("Also testing getAuthorLastName.");
		book1.setAuthorLastName(books[4].getAuthorLastName());
		test(book0, book1);
		System.out.println("Even though " + book0.getTitle() + " was written by: " + book0.getAuthorFirstName() + " "
				+ book0.getAuthorLastName() + " and " + book1.getTitle() + " was written by: " + book1.getAuthorFirstName()
				+ " " + book1.getAuthorLastName());
		System.out.println("Resetting author name...");
		book1.setAuthorLastName("Sanderson");
		
		System.out.println("\nTesting equals on 2 books with identical information but different ISBN10");
		System.out.println("Also testing getIsbn10.");
		book1.setIsbn10(books[4].getIsbn10());
		test(book0, book1);
		System.out.println("Resetting ISBN10.");
		book1.setIsbn10("0765365278");
		
		System.out.println("\nTesting equals on 2 books with idential information but differnt ISBN13");
		System.out.println("Also testing getIsbn13.");
		String temp = book1.getIsbn13();
		book1.setIsbn13(books[4].getIsbn13());
		test(book0, book1);
		System.out.println("Resetting ISBN13");
		book1.setIsbn13(temp);
		
		System.out.println("\nTesting equals for symmetry. With identical books.");
		System.out.println("book0.equals(book1) is "+ book0.equals(book1) + " and book1.equals(book0) is "
				+ book1.equals(book0));	
		
		System.out.println("\nTesting equals for symmetry. With different books.");
		book1= books[4];
		System.out.println("book0.equals(book1) is "+ book0.equals(book1) + " and book1.equals(book0) is "
					+ book1.equals(book0));
		
		System.out.println("\nTesting for transitivity.");
		book0 = books[1];
		book1 = books[2];
		MyBook book2 = new MyBook("Another book with the same ISBN", book0.getAuthorFirstName(), book0.getAuthorLastName(), 
				book0.getIsbn10(), book0.getIsbn13());
		System.out.println("book0.equals(book1) is " + book0.equals(book1) + ". book1.equals(book2) is " + book1.equals(book2) 
			+ ". book0.equals(book2) is " + book0.equals(book2));
		
		
		System.out.println("\nTesting equals with null.");
		System.out.println(book0 + "\nis the same as null? " + book0.equals(null));
		
		System.out.println("\nTesting toString");
		System.out.println(book1);
	}
	
	private static void getHeader()
	{
		System.out.println("Matthew Bowers");
		System.out.println("CMSC 256 Programming Project 1 - MyBook");
		System.out.println("This program consists of a simple class which represents and stores "
				+ "the title, author, and isbn numbers for the book. \nMethods are included" +
				" to set and get each of these variables.");
	}
	
	private static void test(MyBook book0, MyBook book1)
	{
		if(book0.equals(book1))
			System.out.println(book0 + "\nis the same book as\n" + book1);
		else
			System.out.println(book0 + "\nis the not the same book as\n" + book1);
	}
}
