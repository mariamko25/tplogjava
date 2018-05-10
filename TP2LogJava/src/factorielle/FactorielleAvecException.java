package factorielle;

import java.util.Scanner;

import factorielleException.FactorielleExceptionGrandNombre;
import factorielleException.FactorielleExceptionNombreNegatif;
import factorielleException.FactorielleExceptionParametreNonConforme;
import factorielleException.FactorielleExceptionParametreVide;

/**
 * Classe FactorielleAvecException 
 * permet de calculer une factorielle en
 * renvoyant des exceptions
 * @author MariamKonate
 *
 */
public class FactorielleAvecException implements FactorielleInterface 
{

	int nombre;
	
	/**
	 * Constructeur sans arguement
	 */
	FactorielleAvecException()
	{
		
	}
	
	/**
	 * Methode calculant la factorielle 
	 * et l'affiche a l'ecran
	 * @throws FactorielleFormatException 
	 */
	public void CalculFactorielle() 
	{
		System.out.println("Entrez un entier en entrée: ");
		Scanner sc = new Scanner(System.in);
		String chaine=sc.nextLine();
		sc.close();
		if(chaine.equals(""))
		{
			try 
			{
				throw new FactorielleExceptionParametreVide();
			}
			catch (FactorielleExceptionParametreVide e) 
			{
			}
		}
		else 
		{
			String str=ExtractNumber(chaine);
			//Si l'extraction du nombre n'a pas abouti
			if(str.equals(""))
			{
				try 
				{
					throw new FactorielleExceptionParametreNonConforme();
				}
				catch (FactorielleExceptionParametreNonConforme e) 
				{
					
				}
			}
			else
			{
				nombre=Integer.parseInt(str);
				if(nombre<0)
				{
					try 
					{
						throw new FactorielleExceptionNombreNegatif(nombre);
					} 
					catch (FactorielleExceptionNombreNegatif e) 
					{
						
					}
					
				}
				else if(nombre>=20)
				{
					try
					{
						throw new FactorielleExceptionGrandNombre(nombre);
					} 
					catch (FactorielleExceptionGrandNombre e) 
					{
						
					}
				}
				else
				{
					int produit = 1;
					for (int i=1; i<=nombre; i++)
					{
						 produit *= i;
					}
					System.out.println("la factorielle de: "+nombre+" vaut: "+produit);	
				}

			}
			
		}
			
	}
	
	/**
	 * Fonction d'extraction du nombre
	 * @param str
	 * @return
	 */
	public static String ExtractNumber(final String str)
	{                
		
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
		
				
}



