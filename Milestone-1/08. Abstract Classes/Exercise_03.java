/*
 * Create an abstract class Instrument which is having the abstract function play. 

Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override 
the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 

Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print which object is stored at which index of instrument array.

 */
abstract class Instrument
{
	abstract void play();
}
class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing  tan tan tan tan");
	}
}

class Flute extends Instrument
{
	void play()
	{
		System.out.println("Flute is playing  toot toot toot toot");
	}
}

class Guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar is playing  tin  tin  tin");
	}
}
public class Exercise_03 {

	public static void main(String[] args) 
	{
		Instrument[] a = new Instrument[10];
		a[0]= new Piano();
		a[1]= new Flute();
		a[2]= new Guitar();
		a[3]= new Guitar();
		a[4]= new Flute();
		a[5]= new Piano();
		a[6]= new Flute();
		a[7]= new Piano();
		a[8]= new Guitar();
		a[9]= new Guitar();
		for(int i=0;i<10;i++)
		{
			System.out.println("Index: "+i);
			if(a[i] instanceof Piano)
			{
				System.out.println("Instrument: Piano");
				a[i].play();
			}
			else if(a[i] instanceof Flute)
			{
				System.out.println("Instrument: Flute");
				a[i].play();
			}
			else if(a[i] instanceof Guitar)
			{
				System.out.println("Instrument: Guitar");
				a[i].play();
			}
			else
			{
				System.out.println("Invalid Object");
			}
		}
	}

}
