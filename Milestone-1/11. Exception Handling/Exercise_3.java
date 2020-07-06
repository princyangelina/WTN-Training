/*
 * Write a Program to take care of Number Format Exception 
 * if user enters values other than integer for calculating 
 * average marks of 2 students. The name of the students and 
 * marks in 3 subjects are taken from the user while executing 
 * the program.
 
In the same Program write your own Exception classes to take 
care of Negative values and values out of range (i.e. other than 
in the range of 0-100)

 */

import java.util.*;

class InvalidMarksException extends Exception
{
	InvalidMarksException(String s)
	{
		super(s);
	}
}
public class Exercise_3 {

	public static void main(String[] args) {
		String[] name=new String[2];
		int[][] marks =new int[2][3];
		int[] avg =new int[2];
		Scanner sc=new Scanner(System.in);
		try
		{
			for(int i=0;i<2;i++)
			{
				System.out.println("Enter Student's Name:");
				name[i]=sc.next();
				System.out.println("Enter Student's 3 subject marks:");
				for(int j=0;j<3;j++)
				{
					marks[i][j]=Integer.parseInt(sc.next());
					if(marks[i][j]<0 || marks[i][j]>100)
					{
						throw new InvalidMarksException("Number must be in the range of 0-100");
					}
				}
				System.out.println();
				avg[i]=(marks[i][0] + marks[i][1] + marks[i][2])/3;
				System.out.println("The Average marks of the student: "+avg[i]);
			}
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("java.lang.NumberFormatException");
		}
		catch(InvalidMarksException e)
		{
			System.out.println("java.lang.InvalidMarksException: "+e.getMessage());
		}

	}

}
