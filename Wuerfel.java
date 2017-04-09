package polymorphyWuerfel;

public abstract class Wuerfel {
	
	int wert;
	
	Wuerfel() {
		this.wert = 0;
	}
							//überladen
	Wuerfel(int wert) {
		this.wert = wert;
	}
	
	public int getWert() {
		return wert;
	}
	
	public int setWert() {
		return wert;
	}
	
	public abstract int werfen();

}
