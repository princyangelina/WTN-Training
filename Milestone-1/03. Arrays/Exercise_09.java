/*
 * Print a version of the given array where all the 10's have been removed. 
 * The remaining elements should shift left towards the start of the array as needed, and 
 * empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. 
 * You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
 */

public class Exercise_09 {

	public static void main(String[] args) {
		int i,j;
		int[] a= new int[args.length];
		for(i=0,j=-1;i<args.length;i++)
		{
			if(!args[i].equals("10"))
			{
				a[++j]=Integer.parseInt(args[i]);
			}
		}
		for(i=0;i<args.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
