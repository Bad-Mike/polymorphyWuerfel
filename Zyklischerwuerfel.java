package polymorphyWuerfel;

public class Zyklischerwuerfel extends Wuerfel {
	
	int y = 0;
	
	public int werfen() {
		
		if (y < 6) {
			
			y++;
			return y;
			
		} else {
			y = 1;
			return 6;
		}
	}

}
