package menu;

/**
 * Classe d'exception gerant un nombre non compris 
 * entre 1 et N
 * @author MariamKonate
 *
 */
public class MenuExceptionNombreNonCompris extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur sans argument
	 */
	public MenuExceptionNombreNonCompris() 
	{
		System.out.println("le nombre n'est pas compris entre 1 et N");
	}
	
	/**
	 * Constructeur acceptant l'entier donne
	 * par l'utilisateur
	 * @param nombre
	 */
	public MenuExceptionNombreNonCompris(int nombre) 
	{
		System.out.println("le nombre n'est pas compris entre 1 et "+nombre);
	}

}
