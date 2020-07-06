/*
 * Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
 */

public class Example_17 {

	public static void main(String[] args) {
		String str=args[0];
		int len = str.length();
		int h=(int)len/2;
		int i=0;
		while(i<=h)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
			{
				break;
			}
			i++;
		}
		if(i>h)
		{
			System.out.println(str+" is a Palindrome");
		}
		else
		{
			System.out.println(str+" is not a Palindrome");
		}

	}

}
