/*
 * Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
 */

class Fruit
{
	String name, taste;
	double size;
	void eat()
	{
		System.out.println("Name of the fruit is "+name);
		System.out.println("Taste of the fruit is "+taste);
	}
}

class Apple extends Fruit
{
	void eat()
	{
		System.out.println("Name of the fruit is Apple");
		System.out.println("Taste of the fruit is sweet");
	}
}

class Orange extends Fruit
{
	void eat()
	{
		System.out.println("Name of the fruit is Orange");
		System.out.println("Taste of the fruit is sour");
	}
}

public class Exercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple=new Apple();
		Orange orange= new Orange();
		apple.eat();
		orange.eat();

	}

}
