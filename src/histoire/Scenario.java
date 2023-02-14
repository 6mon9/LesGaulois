package histoire;


import personnages.Gaulois;
import personnages.Romain;


public class Scenario {

	public static void main(String[] args) {
		Romain minus ;
		minus = new Romain ("Minus" , 6);
		
		Gaulois asterix;
		asterix = new Gaulois ( " Astérix", 8);
		asterix.parler("Bonjour !");
		
	}

}
