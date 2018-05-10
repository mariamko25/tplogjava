package factorielleException;

/**
 * Classe d'exception gerant un parametre non conforme
 * @author MariamKonate
 *
 */
public class FactorielleExceptionParametreNonConforme extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur sans argument
	 */
	public FactorielleExceptionParametreNonConforme() {
		System.out.println("l'argument doit etre entier");
	}

}
