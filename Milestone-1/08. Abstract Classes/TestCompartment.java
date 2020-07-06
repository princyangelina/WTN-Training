import java.util.*;
/*
 * Create an abstract class Compartment to represent a rail coach. 
 * Provide an abstract function notice in this class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
Override the notice function in each of them to print notice message that is suitable 
to the specific type of  compartment.

 */

abstract class Compartment
{
	public abstract String notice();
}

class FirstClass extends Compartment
{
	public String notice()
	{
		return "First Class Compartment";
	}
}

class Ladies extends Compartment
{
	public String notice()
	{
		return "Ladies Compartment";
	}
}

class General extends Compartment
{
	public String notice()
	{
		return "General Compartment";
	}
}

class Luggage extends Compartment
{
	public String notice()
	{
		return "Luggage Compartment";
	}
}

/*
 * Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the 
range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, 
the second one could be Ladies and so on..]

 */

public class TestCompartment {

	public static void main(String[] args) {
		Compartment luggage=new Luggage();
		Compartment ladies = new Ladies();
		Compartment general = new General();
		Compartment first_class = new FirstClass();
		int[] arr =new int[10];
		
		Random rand =new Random();
		for(int i=0;i<10;i++)
		{
			arr[i]=rand.nextInt(4)+1;
			switch(arr[i])
			{
			case 1:
				System.out.println(luggage.notice());
				break;
			case 2:
				System.out.println(ladies.notice());
				break;
			case 3:
				System.out.println(general.notice());
				break;
			case 4:
				System.out.println(first_class.notice());
				break;
			default:
				System.out.println("Invalid Compartment Number");
				break;
			}
		}

	}

}
