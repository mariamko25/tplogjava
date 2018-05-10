package menu;

import java.util.Scanner;

/**
 * Classe Menu
 * permet de saisir un choix
 * dans un Menu
 * @author MariamKonate
 *
 */
public class Menu {
	
	int nombre;
	String [] options;
	
	/**
	 * Constructeur avec un nombre en entree
	 * @param nombre
	 */
	public Menu(int nombre)
	{
		this.nombre=nombre;
	}
	
	/**
	 * Constructeur avec un string en entree
	 * @param options
	 */
	public Menu(String [] options)
	{
		this.options=options;
	}
	
	/**
	 * Fonction permettant de verifier un choix
	 * @param entier
	 * @return nombre
	 */
	public int SaisirChoix(int entier)
	{
		System.out.println("Entrez un nombre entre 1 et "+entier);
		Scanner sc=new Scanner(System.in);
		String chaine=sc.nextLine();
		sc.close();
		String extracted=ExtractNumber(chaine);
		if(extracted.equals(""))
		{
			try 
			{
				throw new MenuExceptionArgumentInvalide();
			} 
			catch (MenuExceptionArgumentInvalide e) 
			{
				return 0;
				
			}
		}
		else
		{
			nombre=Integer.parseInt(extracted);
			if(nombre<1)
			{
				try 
				{
					throw new MenuExceptionNombreTropBas();
				} 
				catch (MenuExceptionNombreTropBas e) 
				{
					return 0;
				}
			}
			else if(nombre>entier || nombre<1)
			{
				try 
				{
					throw new MenuExceptionNombreNonCompris(entier);
				} 
				catch (MenuExceptionNombreNonCompris e) 
				{
					return 0;
				}
			}
			
			
		}
		return nombre;
		
	}
	
	/**
	 * Fonction d'extraction du nombre
	 * @param str
	 * @return
	 */
	public static String ExtractNumber(final String str)
	{                
		if(str.equals("")) {return "";}
	    StringBuilder sb = new StringBuilder();
	    char car=str.toCharArray()[0];
	    if(Character.isDigit(car) || car=='-')
	    {
	    	sb.append(car);
	    	 String substringstr=str.substring(1);
	 	    for(char c : substringstr.toCharArray())
	 	    {
	 	    		
	 	        if(Character.isDigit(c))
	 	        {
	 	            sb.append(c);
	 	        } else
	 	        {
	 	           return "";           
	 	        }
	 	    }
	 	    if(sb.toString().equals("-"))
	 	    {
	 	    		return "";
	 	    }
	 	    return sb.toString();
	    }
	    return "";
	   
	}
	
	/**
	 * Methode affichant une liste de choix
	 * @param options
	 */
	public void AfficherMenu(String [] options)
	{
		for(String choice:options)
		{
			System.out.println(choice);
		}
	}
	
	/**
	 * Methode affichant une liste de choix
	 */
	public void AfficherMenu()
	{
		for(String choice:options)
		{
			System.out.println(choice);
		}
	}
	
	/**
	 * Methode affichant un menu 
	 * et renvoyant le choix de l'utilisateur
	 * @param options
	 * @return
	 */
	public int ChoixMenu(String []options)
	{
		AfficherMenu(options);
		return SaisirChoix(options.length);
	}
	
	/**
	 * Methode affichant un menu 
	 * et renvoyant le choix de l'utilisateur
	 * @return
	 */
	public int ChoixMenu()
	{
		AfficherMenu(options);
		
		
		return SaisirChoix(options.length);
	}
	
	
}
