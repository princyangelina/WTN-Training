import test.Foundation;
public class Exercise_01 {

	public static void main(String[] args) {
		Foundation obj = new Foundation();
		//System.out.println("Private Access modifier: "+obj.var1); //causes error
		//System.out.println("Default Access modifier: "+obj.var2); //causes error
		//System.out.println("Protected Access modifier: "+obj.var3); //causes error
		System.out.println("Public Access modifier: "+obj.var4); //causes error
	}

}
