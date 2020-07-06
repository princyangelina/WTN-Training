import java.util.Arrays;
/*
 * Write a program to initialize an array and print them in a sorted order.
 */

public class Exercise_06 {

	public static void main(String[] args) {
		int[] arr= {6, 10, 4, 99, 29, 59, 2, 3, 4};
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
