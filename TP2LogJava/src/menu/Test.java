package menu;

/**
 * Classe de test de la classe Menu
 * @author MariamKonate
 *
 */
public class Test {

	
	public static void main(String[] args) {
		
		String choix1="1 Choix 1";
		String choix2="2 Choix 2";
		String choix3="3 Choix 3";
		String choix4="4 Choix 4";
		String choix5="5 Choix 5";
		String choix6="6 Choix 6";
		String choix7="7 Choix 7";
		String choix8="8 Choix 8";
		String choix9="9 Choix 9";
		String [] options=new String[9];
		options[0]=choix1;
		options[1]=choix2;
		options[2]=choix3;
		options[3]=choix4;
		options[4]=choix5;
		options[5]=choix6;
		options[6]=choix7;
		options[7]=choix8;
		options[8]=choix9;
		Menu Menu= new Menu(options);
		int resultat=Menu.ChoixMenu();
		if(resultat!=0)
		{
			System.out.println("Vous avez choisi: "+resultat);
		}
		
	}

}
