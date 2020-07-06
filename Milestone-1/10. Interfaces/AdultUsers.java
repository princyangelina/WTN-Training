/*5. The methods in the AdultUser class should perform the following 
logic. 


registerAccount():

if age > 12, a message displaying “You have successfully registered under 
an Adult Account” should be displayed in the console.

If age<12, a message displaying, “Sorry, Age must be greater than 12 to 
register as an adult” should be displayed in the console.


requestBook function:

if bookType is “Fiction”, a message displaying “Book Issued successfully, 
please return the book within 7 days” should be displayed in the console., 
else, a message displaying, “Oops, you are allowed to take only adult Fiction 
books” should be displayed in the console.
*/

public class AdultUsers implements LibraryUser {
	int age;
	String bookType;
	public void registerAccount(int age)
	{
		if(age>12)
		{
			this.age=age;
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	
	public void requestBook(String bookType)
	{
		if(bookType.equals("Fiction"))
		{
			this.bookType=bookType;
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
}
