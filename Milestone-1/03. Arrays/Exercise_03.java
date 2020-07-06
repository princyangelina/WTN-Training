p/*
 * Write a program to initialize an integer array with values and check if a given number 
 * is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  
number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the 
output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the 
output expected is 3.
 */

public class Exercise_03 {

	public static void main(String[] args) {
		int[] arr= {7, 3, 19, 44, 31, 86, 50};
		int n=Integer.parseInt(args[0]);
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println(i);
				break;
			}
		}
		if(i==arr.length)
		{
			System.out.println(-1);
		}

	}

}
