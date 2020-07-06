/*
 * Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10
 */

public class Example_14 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int sum=0;
		while(num!=0)
		{
			sum+=(num%10);
			num/=10;
		}
		System.out.println(sum);
	}

}
