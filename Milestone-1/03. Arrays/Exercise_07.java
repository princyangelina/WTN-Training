import java.util.Arrays;
/*
 * Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
 */

public class Exercise_07 {

	public static void main(String[] args) {
		int i,p=0;
		int[] a=new int[args.length];
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(a);
		for(i=1;i<args.length;i++)
		{
			if(a[p]!=a[i])
			{
				a[++p]=a[i];
			}
		}
		a=Arrays.copyOf(a, p+1);
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}


	}

}
