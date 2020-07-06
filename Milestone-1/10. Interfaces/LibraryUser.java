/*1. Create an interface LibraryUser with the following methods 
void registerAccount()

void requestBook
()

2. Create 2 classes “KidUsers” and “AdultUser” which implements 
the LibraryUser interface.

3.  Both the classes should have two instance variables - age(int)
,bookType(String)
*/

public interface LibraryUser {
	void registerAccount(int age);
	void requestBook(String bookType);
}
