/*
 * Write a program to check if a given number is prime or not.
 */

public class Example_12 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		if(n==2)
		{
			System.out.println("Prime");
		}
		else if(n!=0 && (n==2 || n%2!=0))
		{
			
			int i;
			for(i=3;i<=n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not a Prime");
					break;
				}
			}
			if(i>n/2)
			{
				System.out.println("Prime");
			}
		}
		else
		{
			System.out.println("Not a Prime");
		}
		

	}

}
