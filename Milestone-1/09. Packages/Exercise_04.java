import com.automobile.FourWheeler.*;
public class Exercise_04 {

	public static void main(String[] args) 
	{
		Logan logan = new Logan("Mahindra Logan", "AP DN 1414", "Kim Seokjin", 100);
		System.out.println("Model Name of the Logan car: "+logan.getModelName());
		System.out.println("Owner Name of the Logan car: "+logan.getOwnerName());
		System.out.println("Registration Number of the Logan car: "+logan.getRegistrationNumber());
		System.out.println("Speed of the Logan car: "+logan.speed());
		logan.gps();
		Ford ford = new Ford("Ford Mustang", "AP NO 1786", "Kim Taehyung", 110);
		System.out.println("Model Name of the Logan car: "+ford.getModelName());
		System.out.println("Owner Name of the Logan car: "+ford.getOwnerName());
		System.out.println("Registration Number of the Logan car: "+ford.getRegistrationNumber());
		System.out.println("Speed of the Logan car: "+ford.speed());
		ford.tempControl();
	}

}
