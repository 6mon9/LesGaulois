package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois [] villageois;
	

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;	
	}
	
	public void ajouterHabitant(Gaulois g) {
		if (nbVillageois < villageois.length) {
			this.villageois[nbVillageois] = g;
			this.nbVillageois++;	
		}
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	
	public void afficherVillageois()
    {
        System.out.println("Dans village du chef Abraracourcis vivent les légendaires gaulois : ");
        for(int i = 0; i < this.nbVillageois; i++)
        {
            System.out.println("-" + this.villageois[i].getNom()); 
        }
    }
	
	
	public static void main(String[] args) {
		Village monVillage;
		
		monVillage = new Village("Village des Irréductibles", 30);
		
		//Gaulois gaulois = monVillage.trouverHabitant(30);	
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		
		
		Chef Abraracourcix;
		
		Abraracourcix = new Chef("Abraracourcix", 6, monVillage );
		
		monVillage.setChef(Abraracourcix);
		monVillage.ajouterHabitant(asterix);
		
		Gaulois gaulois = monVillage.trouverHabitant(1);
		System.out.println(gaulois);
		
		monVillage.afficherVillageois();
	
		
		Gaulois obelix = new Gaulois("Obelix", 25);
		monVillage.ajouterHabitant(obelix);
		monVillage.afficherVillageois();
		
		
	}
	
}
