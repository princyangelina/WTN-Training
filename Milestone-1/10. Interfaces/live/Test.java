package live;
import music.*;
import music.wind.*;
import music.string.*;
public class Test {
	public static void main(String args[]) {
		Veena veena = new Veena();
		Saxophone saxophone = new Saxophone();
		veena.play();
		saxophone.play();
		
		Playable veena_p = new Veena();
		Playable saxophone_p = new Saxophone();
		veena_p.play();
		saxophone_p.play();
	}
}
