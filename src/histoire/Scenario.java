package histoire;




import personnages.Gaulois;
import personnages.Romain;


public class Scenario {

	public static void main(String[] args) {
		Romain minus ;
		Gaulois asterix;
		
		
		minus = new Romain ("Minus" , -6);
		asterix = new Gaulois ( " Astérix", 8);
		
		
		asterix.parler("Bonjour !");
		
		minus.parler(" UN GAU... UN GAUGAU...");
		
		asterix.frapper(minus);
		minus.parler(" Aïe");
		
		asterix.frapper(minus);
		minus.parler(" Aïe");

		asterix.frapper(minus);
		minus.parler(" J'abandonne !");
		
	}

}
