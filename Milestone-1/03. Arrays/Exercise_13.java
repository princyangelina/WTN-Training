/*
 * Write a program to reverse the elements of a given 2*2 array. Four integer numbers 
 * needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
 */

public class Exercise_13 {

	public static void main(String[] args) {
		int[][] a=new int[2][2];
		if(args.length!=4)
		{
			System.out.println("Please Enter 4 integer numbers");
		}
		for(int i=0;i<4 && args.length==4;i++)
		{
			a[(int)i/2][i%2]=Integer.parseInt(args[args.length-i-1]);
		}
		for(int i=0;i<2 && args.length==4;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
