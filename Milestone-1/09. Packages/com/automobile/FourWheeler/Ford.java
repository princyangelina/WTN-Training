package com.automobile.FourWheeler;

public class Ford extends com.automobile.Vehicle{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	public Ford(String m, String r, String o, int s)
	{
		this.modelName=m;
		this.registrationNumber=r;
		this.ownerName=o;
		this.speed=s;
	}
	public String getModelName()
	{
		return modelName;
	}
	public String getRegistrationNumber()
	{
		return registrationNumber;
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public int speed()
	{
		return speed;
	}
	public void tempControl()
	{
		System.out.println("Accessing Air Conditioner...");
	}
}
