/*The methods in the KidUser class should perform the following logic. 

registerAccount():

if age < 12, a message displaying “You have successfully registered 
under a Kids Account” should be displayed in the console. 

If(age>12), a message displaying, “Sorry, Age must be less than 12 to 
register as a kid” should be displayed in the console. 


requestBook():

if bookType is “Kids”, a message displaying “Book Issued successfully, 
please return the book within 10 days” should be displayed in the console,else, a message displaying, “Oops, you are allowed to take only kids books” should be displayed in the console.
*/

public class KidUsers implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount(int age)
	{
		if(age<12)
		{
			this.age=age;
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	
	public void requestBook(String bookType)
	{
		if(bookType.equals("Kids"))
		{
			bookType="Kids";
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}
