/*
 *  Initialize an integer array with ascii values and print the 
 *  corresponding character values in a single row.
 */

public class Exercise_04 {

	public static void main(String[] args) {
		int[] arr= {97, 88, 63, 101, 77};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((char)arr[i]);
		}

	}

}
