/*
 *  Write a program to initialize an integer array and print the sum and average of the array.
 */

public class Exercise_01 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,10, 3};
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.println("Sum of the array: "+sum);
		System.out.println("Average of the array: "+(sum/(float)arr.length));

	}

}
