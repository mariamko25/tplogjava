package entreprise;

/**
 *  Classe commercial un type d'employe
 * @author MariamKonate
 *
 */
public class Commercial extends Employe{

	
	/**
	 * Constructeur avec les infos du commercial et les info salaires
	 * @param nom
	 * @param age
	 * @param numTelephone
	 * @param cA
	 */
	public Commercial(String nom, int age, String numTelephone,int cA) {
		super(nom, age, numTelephone);
		this.cA=cA;
	}

	/**
	 * Constructeur avec les informations du commercial
	 * @param nom
	 * @param age
	 * @param numTelephone
	 */
	public Commercial(String nom, int age, String numTelephone) {
		super(nom, age, numTelephone);
	}

	
	/**
	 * methode permettant le calcul du salaire du commercial
	 * @return salaire
	 */
	public float getSalaire() {
		
		float salaire=(cA*9)/100;
		return salaire;
		
	}
	
	/**
	 * Modifier les informations brutes nécessaire au calcul des salaires
	 * @param cA
	 */
	public void setInfosSalaire(int cA)
	{
		this.cA=cA;
	}

	

	
	
}
