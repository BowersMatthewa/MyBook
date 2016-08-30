
public class MyBookTester 
{
	public static void main(String args[])
	{
		getHeader();
		MyBook book0 = new MyBook();
		
		book0.setIsbn10("o123456789");
		book0.setIsbn10("0123456789");
		book0.setIsbn10("012345678");
		book0.setIsbn13("o123456789012");
		book0.setIsbn13("0123456789012");
		book0.setIsbn13("012345678");
		
		MyBook book1 = new MyBook("Book1", "Matthew", "Bowers", "0123456789", "012356789012");
		
	}
	
	private static void getHeader()
	{
		System.out.println("Matthew Bowers");
		System.out.println("CMSC 256 Programming Project 1 - MyBook");
		System.out.println("This program consists of a simple class which represents and stores "
				+ "the title, author, and isbn numbers for the book. \nMethods are included" +
				" to set and get each of these variables.");
	}
}
