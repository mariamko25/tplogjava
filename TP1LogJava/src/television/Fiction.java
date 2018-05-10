package television;

/**
 *  Classe Fiction un type d'emission
 * @author MariamKonate
 *
 */
public class Fiction extends Emission {
	
	private int annee;
	private String realisateur;
	private boolean rediffusion;
	
	
	/**
	 * Constructeur avec les arguments d'une fiction
	 * @param Nom
	 * @param Annee
	 * @param Realisateur
	 * @param Rediffusion
	 */
	public Fiction(String Nom,int HeureDebut,int Annee,String Realisateur,boolean Rediffusion) {
		super(Nom,HeureDebut);
		annee=Annee;
		realisateur=Realisateur;
		rediffusion=Rediffusion;
		
	}
	/**
	 * Constructeur a un argument
	 * @param Nom
	 */
	public Fiction(String Nom,int HeureDebut) {
		super(Nom,HeureDebut);
		
	}
	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}
	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	/**
	 * @return the realisateur
	 */
	public String getRealisateur() {
		return realisateur;
	}
	/**
	 * @param realisateur the realisateur to set
	 */
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	/**
	 * @return the rediffusion
	 */
	public boolean isRediffusion() {
		return rediffusion;
	}
	/**
	 * @param rediffusion the rediffusion to set
	 */
	public void setRediffusion(boolean rediffusion) {
		this.rediffusion = rediffusion;
	}
	
	/**
	 * Programmation des Fictions
	 * @param HeureDebut
	 */
	public int programmation(int HeureDebut) {
		if(rediffusion==false)
		{
			if(HeureDebut!=21)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				setHeureFin(HeureDebut+2);
				return this.getHeureFin();
			}
		}
		else
		{
			setHeureFin(HeureDebut+2);
			return this.getHeureFin();
		}
		
	}
	
	/**
	 * Methode affichant une fiction
	 */
	public void affichage() {
		System.out.println(getNom()+" "+getHeureDebut()+"H");
		
	}

}
