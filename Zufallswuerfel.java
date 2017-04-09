package polymorphyWuerfel;

import java.util.Random;

public class Zufallswuerfel extends Wuerfel {
	
	Random random = new Random();
	
	public int werfen() {
		
		int wert = random.nextInt((6)+1);
		return wert;
		
	}

}
