/*
 *  Write a program to find the largest 2 numbers and the smallest 
 *  2 numbers in the given array.
 */

public class Exercise_05 {

	public static void main(String[] arr) {
		int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
		int n;
		for(int i=1;i<arr.length;i++)
		{
			n=Integer.parseInt(arr[i]);
			if(n>max1)
			{
				max2=max1;
				max1=n;
			}
			else if(n>max2 && n<max1)
			{
				max2=n;
			}
			if(n<min1)
			{
				min2=min1;
				min1=n;
			}
			else if(n<min2 && n>min1)
			{
				min2=n;
			}
		}
		System.out.println("The 2 largest numbers: "+max1+" "+max2);
		System.out.println("The 2 smallest numbers: "+min1+" "+min2);
	}

}
