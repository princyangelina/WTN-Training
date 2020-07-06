/*
 * 	
 Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
 */

public class Exercise_08 {

	public static void main(String[] args) {
		int i=0, j=args.length-1;
		int[] a= new int[args.length];
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int sum=0;
		for(i=0;i<args.length;i++)
		{
			if(a[i]==6)
			{
				j=i+1;
				while(j<args.length)
				{
					if(a[j]==7)
					{
						i=j;
						break;
					}
					j++;
				}
				if(j==args.length)
				{
					sum+=a[i];
				}
			}
			else
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}

}
