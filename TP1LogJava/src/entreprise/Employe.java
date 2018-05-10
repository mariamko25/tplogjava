package entreprise;

/**
 * classe abstraite contenant les 
 * specificite d'un employe
 * @author MariamKonate
 *
 */
public abstract class Employe implements EmployeInterface {
	
	protected String nom;
	protected int age;
	protected String numTelephone;
	protected int nbHeuresDeTravail;
	protected int cA;
	protected int tarifHoraire;
	
	/**
	 * Constructeur avec les informations de l'employe
	 * @param nom
	 * @param age
	 * @param numTelephone
	 */
	public Employe(String nom,int age,String numTelephone)
	{
		this.nom=nom;
		this.age=age;
		this.numTelephone=numTelephone;
	}
	
	
	/**
	 * Constructeur avec les infos employe et les info salaires
	 * @param nom
	 * @param age
	 * @param numTelephone
	 * @param nbHeuresDeTravail
	 * @param cA
	 */
	public Employe(String nom,int age,String numTelephone,int nbHeuresDeTravail,int cA,int tarifH)
	{
		this.nom=nom;
		this.age=age;
		this.numTelephone=numTelephone;
		this.nbHeuresDeTravail=nbHeuresDeTravail;
		this.cA=cA;
		this.tarifHoraire=tarifH;
	}
	
	/**
	 * @return the nbHeuresDeTravail
	 */
	public int getNbHeuresDeTravail() {
		return nbHeuresDeTravail;
	}

	/**
	 * @return the cA
	 */
	public int getcA() {
		return cA;
	}

	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	/**
	 * @return the numTelephone
	 */
	public String getNumTelephone() {
		return numTelephone;
	}
	
	
	/**
	 * @param numTelephone the numTelephone to set
	 */
	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}

	
	/**
	 * @return the tarifHoraire
	 */
	public int getTarifHoraire() {
		return tarifHoraire;
	}

	/**
	 * Affiche le salaire d'un commercial
	 */
	public void AffichageSalaire() {
		
		System.out.println(nom+ " gagne "+ getSalaire()+"€");
	}

}
