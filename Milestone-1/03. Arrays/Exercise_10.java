/*
 * Print an array that contains the exact same numbers as the given array, 
 * but rearranged so that all the even numbers come before all the odd numbers. 
 * Other than that, the numbers can be in any order. You may modify and print the given array,
 * or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
 */

public class Exercise_10 {

	public static void main(String[] args) {
		int i,l=-1,r=args.length;
		int[] a= new int[args.length];
		for(i=0;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])%2==0)
			{
				a[++l]=Integer.parseInt(args[i]);
			}
			else
			{
				a[--r]=Integer.parseInt(args[i]);
			}
		}
		for(i=0;i<args.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
