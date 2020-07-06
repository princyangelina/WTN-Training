/*
 *  Write a program to initialize an integer array 
 *  and find the maximum and minimum value of the array.
 */

public class Exercise_02 {

	public static void main(String[] args) {
		int[] arr= {5, 1, 3, 8, 33, 56, 9};
		int min=arr[0], max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum value in the array: "+max);
		System.out.println("Minimum value in the array: "+min);
	}

}
