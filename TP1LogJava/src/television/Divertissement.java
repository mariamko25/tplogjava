package television;

/**
 *  Classe Divertissement un type d'emission
 * @author MariamKonate
 *
 */
public class Divertissement extends Emission {

	private int duree;
	
	/**
	 * Constructeur avec les arguments d'un divertissement
	 * @param Nom
	 * @param HeureDebut
	 * @param Duree
	 */
	public Divertissement(String Nom,int HeureDebut,int Duree) {
		super(Nom,HeureDebut);
		duree=Duree;
		
	}
	/**
	 * Constructeur a un argument
	 * @param Nom
	 */
	public Divertissement(String Nom,int HeureDebut) {
		super(Nom,HeureDebut);
		duree=2;
		
	}

	/**
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	/**
	 * Programmation des divertissements
	 * @param HeureDebut
	 */
	public int programmation(int HeureDebut) {
		if(HeureDebut<=23 && HeureDebut>=18)
		{
			setHeureFin(HeureDebut+duree);
			return this.getHeureFin();
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * Affichage de l'emission
	 */
	public void affichage() {
		System.out.println(getNom()+" "+getHeureDebut()+"H");
	}

}
