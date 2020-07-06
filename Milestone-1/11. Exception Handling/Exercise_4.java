/*
 *  A student portal provides user to register their profile. 
 *  During registration the system needs to validate the user 
 *  should be located in India. If not the system should throw 
 *  an exception.

Step 1: Create a user defined exception class named �InvalidCountryException�.
Step 2: Overload the respective constructors.
Step 3: Create a main class �UserRegistration�, add the following method,
void registerUser(String username,String userCountry) with the below 
implementation

� if userCountry is not equal to  �India� throw a InvalidCountryException 
with the message �User Outside India  cannot be registered�
� if userCountry is equal to  �India�,  print the message �User registration 
done successfully�

Invoke the method registerUser from the main method with the data specified and 
see how the program behaves.
Example1)
i/p:Mickey,US 
o/p:InvalidCountryException should be thrown.
The message should be �User Outside India  cannot be registered�

Example2)
i/p:Mini,India
o/p:User registration done successfully

 */

import java.util.*;

class InvalidCountryException extends Exception
{
	InvalidCountryException(String s)
	{
		super(s);
	}
}
public class Exercise_4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter your name:");
			String name=sc.next();
			System.out.println("Enter your Country:");
			String country=sc.next();
			if(!country.equals("India"))
			{
				throw new InvalidCountryException("User Outside India  cannot be registered");
			}
			else
			{
				System.out.println("User registration done successfully");
			}
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
