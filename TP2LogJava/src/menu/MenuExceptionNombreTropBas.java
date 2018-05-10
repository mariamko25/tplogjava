package menu;

/**
 * Classe d'exception gerant un nombre < 1
 * @author MariamKonate
 *
 */
public class MenuExceptionNombreTropBas extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur sans argument
	 */
	public MenuExceptionNombreTropBas() 
	{
		System.out.println("Choix non valide le nombre est inferieur a 1");
	}

}
