import java.util.*;
public class Exercise_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.next());
		String bin = String.format("%8s", Integer.toBinaryString(num)).replace(" ", "0");
		System.out.println(bin);
	}

}
