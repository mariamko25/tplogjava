package television;

/**
 * classe abstraite contenant les 
 * specificite d'une emission
 * @author MariamKonate
 *
 */
public abstract class Emission implements EmissionInterface {
	private String nom;
	private int heureDebut;
	private int heureFin;
	
	/**
	 * Constructeur a un argument
	 * @param Nom
	 */
	Emission(String Nom,int HeureDebut)
	{
		setNom(Nom);
		setHeureDebut(HeureDebut);
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the heureDebut
	 */
	public int getHeureDebut() {
		return heureDebut;
	}

	/**
	 * @param heureDebut the heureDebut to set
	 */
	public void setHeureDebut(int heureDebut) {
		this.heureDebut = heureDebut;
	}

	/**
	 * @return the heureFin
	 */
	public int getHeureFin() {
		return heureFin;
	}

	/**
	 * @param heureFin the heureFin to set
	 */
	public void setHeureFin(int heureFin) {
		this.heureFin = heureFin;
	}
	

}
