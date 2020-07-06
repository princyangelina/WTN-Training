package com.automobile.vehicle;

public class Hero extends com.automobile.Vehicle{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	public Hero(String m, String r, String o, int s)
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
	public int getSpeed()
	{
		return speed;
	}
	public void radio()
	{
		System.out.println("Accessing Radio");
	}
}
