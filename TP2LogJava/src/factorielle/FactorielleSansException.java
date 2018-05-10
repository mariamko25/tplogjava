package factorielle;

import java.util.Scanner;

/**
 * Classe FactorielleSansException 
 * permet de calculer une factorielle sans
 * renvoyer d'exception
 * @author MariamKonate
 *
 */
public class FactorielleSansException implements FactorielleInterface{
	
	int nombre;
	
	/**
	 * Constructeur sans arguement
	 */
	FactorielleSansException()
	{
		
	}
	
	/**
	 * Methode calculant la factorielle 
	 * et l'affiche a l'ecran
	 */
	public void CalculFactorielle() 
	{
		System.out.println("Entrez un entier en entrée: ");
		Scanner sc = new Scanner(System.in);
		String chaine=sc.nextLine();
		sc.close();
		nombre=Integer.parseInt(chaine);
		int produit = 1;
		for (int i=1; i<=nombre; i++)
		{
			 produit *= i;
		}
		System.out.println("la factorielle de: "+nombre+" vaut: "+produit);	
			
	}

	
	

}
