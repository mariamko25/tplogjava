package entreprise;

import java.util.ArrayList;
import java.util.List;

/**
 * Class permettant de tester notre code
 * @author MariamKonate
 *
 */
public class Paie {
	public static void main(String args[])
	{
		//Creation des commerciaux
		Commercial comm1=new Commercial("comm1",25,"0681986833",10000);
		Commercial comm2=new Commercial("comm2",35,"0681985833",1000);
		Commercial comm3=new Commercial("comm3",45,"0681987833",4000000);
		
		//Creation des ouvrier
		Ouvrier ouvr1=new Ouvrier("ouvr1",25,"0681986833",35,10);
		Ouvrier ouvr2=new Ouvrier("ouvr2",35,"0681985833",40,12);
		Ouvrier ouvr3=new Ouvrier("ouvr3",45,"0681987833",60,14);
		
		//Creation des collaborateurs
		Collaborateur col1=new Collaborateur("col1",25,"0681986833",35,10000,30);
		Collaborateur col2=new Collaborateur("col2",35,"0681985833",40,10000,32);
		Collaborateur col3=new Collaborateur("col3",45,"0681987833",60,10000,34);
		
		//Creation des cadres
		Cadre cadre1=new Cadre("cadre1",25,"0681986833",35,20);
		Cadre cadre2=new Cadre("cadre2",35,"0681985833",40,22);
		Cadre cadre3=new Cadre("cadre3",45,"0681987833",60,24);
		
		//Creation de la liste
		List<Employe> list= new ArrayList<Employe>();
		list.add(comm1);
		list.add(comm2);
		list.add(comm3);
		list.add(ouvr1);
		list.add(ouvr2);
		list.add(ouvr3);
		list.add(col1);
		list.add(col2);
		list.add(col3);
		list.add(cadre1);
		list.add(cadre2);
		list.add(cadre3);
		//Parcours de la liste
		for (Employe E : list)
		{
			E.AffichageSalaire();
		}
		
		
	}
	
}
