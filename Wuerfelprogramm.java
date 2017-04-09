package polymorphyWuerfel;

public class Wuerfelprogramm {
	
	public static void main(String args[]) {
		
		Konstanterwuerfel wuerfel1 = new Konstanterwuerfel();
		Zufallswuerfel wuerfel2 = new Zufallswuerfel();
		Zyklischerwuerfel wuerfel3 = new Zyklischerwuerfel();
		
		for (int x = 0; x < 10; x++) {
			
			System.out.println("Konstanterwuerfel: " + wuerfel1.werfen());
			System.out.println("Zufallswuerfel: " + wuerfel2.werfen());
			System.out.println("Zyklischerwuerfel: " + wuerfel3.werfen());
			
		}
		
	}

}
