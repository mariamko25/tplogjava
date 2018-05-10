package entreprise;

/**
 *  Classe cadre un type d'employe
 * @author MariamKonate
 *
 */
public class Cadre extends Employe {

	/**
	 * Constructeur avec les informations du cadre
	 * @param nom
	 * @param age
	 * @param numTelephone
	 */
	public Cadre(String nom, int age, String numTelephone) {
		super(nom, age, numTelephone);
	}

	/**
	 * Constructeur avec les infos du cadre et les info salaires
	 * @param nom
	 * @param age
	 * @param numTelephone
	 * @param nbHeuresDeTravail
	 * @param tarifH
	 */
	public Cadre(String nom, int age, String numTelephone, int nbHeuresDeTravail, int tarifH) {
		super(nom, age, numTelephone);
		this.nbHeuresDeTravail=nbHeuresDeTravail;
		this.tarifHoraire=tarifH;
	}

	
	/**
	 * methode permettant le calcul du salaire du cadre
	 * @return salaire
	 */
	public float getSalaire() {
		
		int heureSup=35- nbHeuresDeTravail;
		float tarifHeurSup=(50*tarifHoraire/100)+tarifHoraire;
		float salaire;
		if(heureSup<=0)
		{
			salaire= nbHeuresDeTravail*tarifHoraire;
		}
		else
		{
			salaire= nbHeuresDeTravail*tarifHoraire+ heureSup*tarifHeurSup;
		}
		
		return salaire;
		
	}

	/**
	 * Modifier les informations brutes nécessaire au calcul des salaires
	 * @param nbHeuresDeTravail
	 * @param tarifH
	 */
	public void setInfosSalaire(int nbHeuresDeTravail,int tarifH)
	{
		this.nbHeuresDeTravail=nbHeuresDeTravail;
		this.tarifHoraire=tarifH;
	}
	
	


}
