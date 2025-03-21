package nintendo.test;

import nintendo.model.Client;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Console switchConsole = new Console("switch", 300, LocalDate.parse("2017-03-03"));
		Console playstation = new Console("ps3", 400, LocalDate.parse("2006-11-11"));
		Console nintendoDs= new Console("nintendo 3ds", 200, LocalDate.parse("2010-09-29"));
		
		Jeu j1 = new Jeu("Mario galaxie",switchConsole);
		Jeu j2 = new Jeu("Zelda Breath of the wild",switchConsole);
		Jeu j3 = new Jeu("Samus pirate",playstation);
		Jeu j4 = new Jeu("Pokemon rouge",nintendoDs);
		Jeu j5 = new Jeu("Smash Bros",switchConsole);
		
		Achat a1 = new Achat(j1, LocalDateTime.now(), 200);
		Achat a2 = new Achat(j3, LocalDateTime.now(), 500);
		Achat a3 = new Achat(j4, LocalDateTime.now(), 100);
		
	    
		Client c1 = new Client("Tony","Spredeman");
		Client c2 = new Client("Stefan","Burmetler");
		
		//création des listes d'achats 
	    List<Achat> listeTony = new ArrayList();
	    List<Achat> listeStefan = new ArrayList();
	    
	    Collections.addAll(listeTony, a1, a2, a3);
	    Collections.addAll(listeStefan, a2, a3);
	    
	    c1.setListeAchats(listeTony);
	    c2.setListeAchats(listeStefan);
		
		Boutique boutique = new Boutique("Micromania", "42 rue du Gaming");
		
		//affecter une boutique aux jeux
		j1.setBoutique(boutique);
		j2.setBoutique(boutique);
		j3.setBoutique(boutique);
		j4.setBoutique(boutique);
		j5.setBoutique(boutique);

	}

}
