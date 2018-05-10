package factorielleException;

/**
 * Classe d'exception gerant un entier trop grand
 * @author MariamKonate
 *
 */
public class FactorielleExceptionGrandNombre extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur acceptant l'entier donne
	 * par l'utilisateur
	 * @param nombre
	 */
	public FactorielleExceptionGrandNombre(int nombre)
	{
		System.out.println(nombre+" est trop grand pour ce programme");
	}
	
	/**
	 * Constructeur sans argument
	 */
	public FactorielleExceptionGrandNombre()
	{
		System.out.println("le nombre est trop grand pour ce programme");
	}

}
