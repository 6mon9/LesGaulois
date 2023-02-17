package personnages;

import  java.util;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	public String  preparerPotion(int effetPotionMin, int effetPotionMax ) {
		Random potion = nextInt(effetPotionMax);
		String texte;
		
		if (potion > 7) {
			texte = "J'ai préparé une super potion de force" ;
		} else {
			texte = "Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " ;
		}
		System.out.println(prendreParole() + "« " + texte + potion + "»");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	
	
	
	public static void main(String[] args) {
		Druide panoramix;
		
		panoramix = new Druide ("Panoramix", 5 , 10);
		
		System.out.println(panoramix.preparerPotion());
		
	}
}
