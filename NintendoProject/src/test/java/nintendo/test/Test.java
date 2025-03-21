package nintendo.test;

import nintendo.model.Client;
import java.time.LocalDate;
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
		Client c1 = new Client("Tony","Spredeman");
		Client c2 = new Client("Stefan","Burmetler");
		Boutique boutique = new Boutique("Micromania", "42 rue du Gaming");

	}

}
