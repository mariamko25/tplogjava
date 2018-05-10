package entreprise;

/**
 *  Classe commercial un type d'employe
 * @author MariamKonate
 *
 */
public class Collaborateur extends Employe {
	
	/**
	 * Constructeur avec les informations du collaborateur
	 * @param nom
	 * @param age
	 * @param numTelephone
	 */
	public Collaborateur(String nom, int age, String numTelephone) {
		super(nom, age, numTelephone);
	}

	/**
	 * Constructeur avec les infos du collaborateur et les info salaires
	 * @param nom
	 * @param age
	 * @param numTelephone
	 * @param nbHeuresDeTravail
	 * @param cA
	 * @param tarifH
	 */
	public Collaborateur(String nom, int age, String numTelephone, int nbHeuresDeTravail, int cA, int tarifH) {
		super(nom, age, numTelephone, nbHeuresDeTravail, cA, tarifH);
		
	}

	/**
	 * methode permettant le calcul du salaire du collaborateur
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
		float salaireCA=(cA*9)/100;
		salaire+=salaireCA;
		return salaire;
	}
	
	/**
	 * Modifier les informations brutes nécessaire au calcul des salaires
	 * @param nbHeuresDeTravail
	 * @param cA
	 * @param tarifH
	 */
	public void setInfosSalaire(int nbHeuresDeTravail,int cA,int tarifH)
	{
		this.nbHeuresDeTravail=nbHeuresDeTravail;
		this.cA=cA;
		this.tarifHoraire=tarifH;
	}

	
	

}
