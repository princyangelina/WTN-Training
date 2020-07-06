/*6. Create a class “LibraryInterfaceDemo.java” with a main 
method and test the functionalities by creating objects of 
KidUser and AdultUser classes.
*/

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		LibraryUser gunhoo = new KidUsers();
		LibraryUser jungkook =new AdultUsers();
		jungkook.registerAccount(23);
		gunhoo.registerAccount(3);
		gunhoo.requestBook("Kids");
		jungkook.requestBook("Kids");
		jungkook.requestBook("Fiction");
	}

}
