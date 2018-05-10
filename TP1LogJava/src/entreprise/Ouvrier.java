/**
 * 
 */
package entreprise;

/**
 * Classe Ouvrier un type d'employe
 * @author MariamKonate
 *
 */
public class Ouvrier extends Employe{

	/**
	 * Constructeur avec les informations de l'ouvrier
	 * @param nom
	 * @param age
	 * @param numTelephone
	 */
	public Ouvrier(String nom, int age, String numTelephone) {
		super(nom, age, numTelephone);
	}
	
	/**
	 * Constructeur avec les infos de l'ouvrier et les info salaires
	 * @param nom
	 * @param age
	 * @param numTelephone
	 * @param nbHeuresDeTravail
	 * @param cA
	 * @param tarifH
	 */
	public Ouvrier(String nom,int age,String numTelephone,int nbHeuresDeTravail,int tarifH)
	{
		super(nom, age, numTelephone);
		this.nbHeuresDeTravail=nbHeuresDeTravail;
		this.tarifHoraire=tarifH;
	}
	
	/**
	 * methode permettant le calcul du salaire de l'ouvrier
	 * @return salaire
	 */
	public float getSalaire() {
		
		int heureSup=35- nbHeuresDeTravail;
		float tarifHeurSup=(30*tarifHoraire/100)+tarifHoraire;
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
