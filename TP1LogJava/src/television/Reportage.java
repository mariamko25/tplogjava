package television;

/**
 *  Classe Reportage un type d'emission
 * @author MariamKonate
 *
 */
public class Reportage extends Divertissement {

	private String theme;
	
	/**
	 * Constructeur avec les arguments d'un Reportage
	 * @param Nom
	 * @param HeureDebut
	 * @param Duree
	 * @param Theme
	 */
	public Reportage(String Nom,int HeureDebut, int Duree,String Theme) {
		super(Nom, HeureDebut,Duree);
		theme=Theme;
		
	}
	
	/**
	 * Constructeur avec les arguments d'un Divertissement
	 * @param Nom
	 * @param HeureDebut
	 * @param Duree
	 */
	public Reportage(String Nom, int HeureDebut,int Duree) {
		super(Nom, HeureDebut,Duree);
	}

	/**
	 * Constructeur avec les arguments d'une Emission
	 * @param Nom
	 * @param HeureDebut
	 */
	public Reportage(String Nom,int HeureDebut) {
		super(Nom,HeureDebut);
	}

	/**
	 * @return the theme
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	/**
	 * Affichage de l'emission
	 */
	public void Affichage() {
		System.out.println(getTheme()+" "+getNom()+" "+getDuree()+"H");
	}
	
	/**
	 * Programmation des Reportages
	 * @param HeureDebut
	 */
	public int programmation(int HeureDebut) {
		
			setHeureFin(HeureDebut+2);
			return this.getHeureFin();
		
	}

}
