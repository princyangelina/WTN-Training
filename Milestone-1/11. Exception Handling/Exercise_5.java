/*
 *  
Write a program to accept name and age of a person 
from the command prompt(passed as arguments when you 
execute the class) and ensure that 
the age entered is >=18 and < 60. 
Display proper error messages. 

The program must exit gracefully after displaying the 
error message in case the arguments passed are not proper.
(Hint : Create a user defined exception class for handling 
 errors.)

 */
import java.util.*;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}

public class Exercise_5 {

	public static void main(String[] args) {
		String name;
		int age;
		try
		{
			name=args[0];
			age=Integer.parseInt(args[1]);
			if(age<18 || age>=60)
			{
				throw new InvalidAgeException("Age must be in the range of 18-60");
			}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Details");
		}
		

	}

}
