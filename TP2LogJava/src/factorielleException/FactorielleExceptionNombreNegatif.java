package factorielleException;

/**
 * Classe d'exception gerant un entier negatif
 * @author MariamKonate
 *
 */
public class FactorielleExceptionNombreNegatif extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructeur acceptant l'entier donne
	 * par l'utilisateur
	 * @param nombre
	 */
	public FactorielleExceptionNombreNegatif(int nombre)
	{
		System.out.println(nombre+" est negatif la factorielle n'est pas definie");

	}
	
	/**
	 * Constructeur sans argument
	 */
	public FactorielleExceptionNombreNegatif()
	{
		System.out.println("le nombre est negatif la factorielle n'est pas definie");

	}

}
