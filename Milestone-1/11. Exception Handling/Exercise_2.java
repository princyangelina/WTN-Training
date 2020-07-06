/*
 * Write a class MathOperation which accepts 5 integers through command line. 
 * Create an array using these parameters. Loop through the array and obtain 
 * the sum and average of all the elements and display the result. 
 */


public class Exercise_2 {

	public static void main(String[] args) 
	{
		try
		{
			int[] arr =new int[5];
			int sum=0, avg;
			for(int i=0;i<5;i++)
			{
				arr[i]=Integer.parseInt(args[i]);
				sum+=arr[i];
			}
			avg=sum/5;
			System.out.println("The Sum of all the elements: "+sum);
			System.out.println("The Average of all the elements: "+avg);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
