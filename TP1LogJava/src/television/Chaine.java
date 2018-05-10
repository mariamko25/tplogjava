package television;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Chaine {

	private HashMap<Integer,Emission>liste;
	
	/**
	 * Constructeur sans argument
	 */
	public Chaine() {
		liste=new HashMap<Integer,Emission>();
	}
	/**
	 * @return the liste
	 */
	public  HashMap<Integer,Emission> getListe() {
		return liste; 
	}
	/**
	 * @param liste the liste to set
	 */
	public void setListe( HashMap<Integer,Emission> liste) {
		this.liste = liste;
	}
	
	/**
	 * Afficher la liste des emissions
	 */
	public void affichage()
	{
		for(Entry<Integer, Emission> e : liste.entrySet())
		{
				e.getValue().affichage();
		}
	}
	
	/**
	 * Methode verifiant la superposition de deux emissions
	 * @return
	 */
	public boolean superposition()
	{
		for(Entry<Integer, Emission> e1 : liste.entrySet())
		{
			for(Entry<Integer, Emission> e2 : liste.entrySet())
			{
				if(e1.getValue().getHeureDebut()==e2.getValue().getHeureDebut())
				{
					return true;
				}
			}
		}
		return false;
		
	}
	
	/**
	 * Affichage des emissions Heure par Heure
	 */
	public void AffichageHeureParHeure()
	{
		Map sortedMap=new TreeMap(liste);
		Set set= sortedMap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, Emission> entry=(Map.Entry<Integer, Emission>)iterator.next();
			entry.getValue().affichage();
		}
		
		
	}
	
	public static void main(String args [])
	{
		Divertissement div1=new Divertissement("Dora",18) ;
		Divertissement div2=new Divertissement("Foot",20) ;
		Divertissement div3=new Divertissement("Basket",22) ;
		
		Reportage rep1=new Reportage("40 minute Inside",16);
		Reportage rep2=new Reportage("Les savants du sud",0);
		Reportage rep3=new Reportage("Les incroyables histoires",14);
		
		Fiction fict1=new Fiction("Harry potter",12);
		Fiction fict2=new Fiction("Iron man",10);
		Fiction fict3=new Fiction("L'attaque des titans",8);
		
		Chaine chaine=new Chaine();
		chaine.getListe().put(18,div1);
		chaine.getListe().put(16,rep1);
		chaine.getListe().put(12,fict1);
		chaine.getListe().put(20,div2);
		chaine.getListe().put(0,rep2);
		chaine.getListe().put(10,fict2);
		chaine.getListe().put(22,div3);
		chaine.getListe().put(14,rep3);
		chaine.getListe().put(8,fict3);
		
		chaine.AffichageHeureParHeure();
		
		
	}
	

}
