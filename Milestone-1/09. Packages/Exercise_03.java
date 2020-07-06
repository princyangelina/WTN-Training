/*
 Create a package called com.automobile. Define an abstract class called Vehicle. 
Vehicle class has the following abstract methods: 
public String getModelName() 
public String getRegistrationNumber() 
public String getOwnerName() 

Create twowheeler subpackage under automobile package
Hero  class extends  automobile.vehicle class with the following methods
public int getSpeed() 
– returns the current speed of the vehicle.
public void radio() 
– provides facility to control the radio device 

Honda class extends com.automobile.vehicle class with the following methods
public int getSpeed()
– Returns the current speed of the vehicle.
public void cdplayer() 
– provides facility to control the cd player device which is available in the car.

Create a test class to test the methods available in all these child class.

 */


import com.automobile.vehicle.*;
public class Exercise_03 
{
	public static void main(String args[])
	{
		Hero hero = new Hero("Hero Splendor Plus", "AP DN 7525", "Jeon Jungkook", 77);
		System.out.println("Model Name of the Hero Bike: "+hero.getModelName());
		System.out.println("Owner Name of Hero Bike: "+hero.getOwnerName());
		System.out.println("Registration Number of the Hero Bike: "+hero.getRegistrationNumber());
		System.out.println("Speed of the Hero Bike: "+hero.getSpeed());
		hero.radio();
		Honda honda = new Honda("Honda Navi", "AP NR 1387", "Park Jimin", 90);
		System.out.println("Model Name of the Honda Bike: "+honda.getModelName());
		System.out.println("Owner Name of Honda Bike: "+honda.getOwnerName());
		System.out.println("Registration Number of the Honda Bike: "+honda.getRegistrationNumber());
		System.out.println("Speed of the Honda Bike: "+honda.getSpeed());
		honda.cdplayer();
	}
	
}
