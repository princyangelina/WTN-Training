package com.automobile.vehicle;

public class Honda {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	public Honda(String m, String r, String o, int s)
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
	public void cdplayer()
	{
		System.out.println("Accessing CD player");
	}
}
