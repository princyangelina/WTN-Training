/*
 *  Given 2 int arrays, a and b, each length 3, form a new array of length 2, 
 *  containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */

public class Exercise_12 {

	public static void main(String[] args) {
		int[] a=new int[2];
		a[0]=Integer.parseInt(args[1]);
		a[1]=Integer.parseInt(args[4]);
		System.out.println(a[0]+" "+a[1]);
	}

}
