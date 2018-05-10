package factorielleException;

/**
 * Classe d'exception gerant une chaine est vide 
 * @author MariamKonate
 *
 */
public class FactorielleExceptionParametreVide extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur sans argument
	 */
	public FactorielleExceptionParametreVide() {
		
		System.out.println("vous n'avez pas donne de parametre");
	}

}
