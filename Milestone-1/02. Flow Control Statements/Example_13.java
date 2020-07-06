/*
 * Write a program to print prime numbers between 10 and 99.
 */

public class Example_13 {

	public static void main(String[] args) {
		int i,j;
		for(i=10;i<=99;i++)
		{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j>i/2)
			{
				System.out.println(i);
			}
		}

	}

}
