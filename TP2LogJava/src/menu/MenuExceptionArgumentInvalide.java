package menu;

/**
 * Classe d'exception gerant un argument non valide
 * @author MariamKonate
 *
 */
public class MenuExceptionArgumentInvalide extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur sans argument
	 */
	public MenuExceptionArgumentInvalide() 
	{
		System.out.println("Choix non valide ce n'est pas un nombre");
	}

}
