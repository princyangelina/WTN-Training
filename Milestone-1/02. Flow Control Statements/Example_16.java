/*
 *  Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
 */

public class Example_16 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		while(n!=0)
		{
			System.out.print(n%10);
			n/=10;
		}

	}

}
