/*
 * Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *
 */

public class Example_15 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,j;
		for(i=1;i<=n;i++)
		{
			j=1;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
		}

	}

}
