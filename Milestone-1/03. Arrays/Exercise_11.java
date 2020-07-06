/*
 * Given an array of type int, print true if every element is 1 or 4. 

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */

public class Exercise_11 {

	public static void main(String[] args) {
		int n,m,i=0,j=args.length-1;
		while(i<=j)
		{
			n=Integer.parseInt(args[i]);
			m=Integer.parseInt(args[i]);
			if((n!=1 || n!=4) && (m!=1 || m!=4))
					
			{
				System.out.println("false");
				break;
			}
			i++;
			j--;
		}
		if(i>j)
		{
			System.out.println("true");
		}

	}

}
