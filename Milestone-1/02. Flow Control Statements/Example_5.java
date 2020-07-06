/*
 * Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
 */

public class Example_5 {

	public static void main(String[] args) {
		char c='7';
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
		{
			System.out.println("Alphabet");
		}
		else if(c>='0' && c<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
			

	}

}
