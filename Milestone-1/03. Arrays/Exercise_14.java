/*
 *  2 1
Two Dimensional Array	
14	
 Write a program to find the biggest number in a 3*3 array. The program is supposed 
 to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
 */

public class Exercise_14 {

	public static void main(String[] args) {
		int max=Integer.MIN_VALUE;
		if(args.length==9)
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(Integer.parseInt(args[i*3+j])>max)
					{
						max=Integer.parseInt(args[i*3+j]);
					}
				}
			}
			System.out.println("The biggest number in the given array is "+max);
		}
		else
		{
			System.out.println("Please enter 9 integer numbers");
		}

	}

}
