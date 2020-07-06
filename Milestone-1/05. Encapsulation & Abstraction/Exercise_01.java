/*
 * Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price 
(double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author 
details)
 */

class Author
{
	private String name, email, gender;
	
	//parameterized constructor for initialization
	Author(String name, String email, String gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	//Setter methods
	void setName(String name)
	{
		this.name=name;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	void setGender(String gender)
	{
		this.gender=gender;
	}
	
	//Getter methods
	String getName()
	{
		return name;
	}
	String getEmail()
	{
		return email;
	}
	String getGender()
	{
		return gender;
	}
}

class Book
{
	private String name, author;
	private double price;
	private int qtyInStock;
	
	//parameterized constructor for initialization
	Book(String name, String author, double price, int qtyInStock)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	
	//Setter methods
	void setName(String name)
	{
		this.name=name;
	}
	void setAuthor(String author)
	{
		this.author=author;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock=qtyInStock;
	}
	
	//Getter methods
	String getName()
	{
		return name;
	}
	String getAuthor()
	{
		return author;
	}
	double getPrice()
	{
		return price;
	}
	int getQtyInStock()
	{
		return qtyInStock;
	}
	
}

public class Exercise_01 {

	public static void main(String[] args) 
	{
		Author author = new Author("John Green", "johngreen@gmail.com", "Male");
		Book book = new Book("The Fault In Our Stars", "John Green", 450.00, 1000);
		System.out.println("Book Details \nTitle: "+book.getName()+
				"\nAuthor: "+book.getName()+
				"\nPrice of the Book: "+book.getPrice()+
				"\nQualtity in stock: "+book.getQtyInStock());
		System.out.println("\nAuthor Details \nName: "+author.getName()+
				"\nEmail ID: "+author.getEmail()+
				"\nGender: "+author.getGender());
		
		//updating the information of book using setters
		book.setPrice(500.00);
		book.setQtyInStock(200);
		
		//updating the information of author using setters
		author.setEmail("johngreenofficial@gmail.com");
		
		System.out.println("\nUpdated Book Details \nTitle: "+book.getName()+
				"\nAuthor: "+book.getName()+
				"\nPrice of the Book: "+book.getPrice()+
				"\nQualtity in stock: "+book.getQtyInStock());
		System.out.println("\nUpdated Author Details \nName: "+author.getName()+
				"\nEmail ID: "+author.getEmail()+
				"\nGender: "+author.getGender());
	}

}
