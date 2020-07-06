/*
 * Write a program to check if a given integer number is odd or even.
 */

public class Example_2 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if((a&1)==1)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}

	}

}
