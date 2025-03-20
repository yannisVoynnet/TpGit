package nintendo.test;

import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Console switchConsole = new Console("switch");
		Console playstation = new Console("ps3");
		Console nintendoDs= new Console("nintendo 3ds");
				
		Jeu j1 = new Jeu("Mario galaxie",switchConsole);
		Jeu j2 = new Jeu("Zelda Breath of the wild",switchConsole);
		Jeu j3 = new Jeu("Samus pirate",playstation);
		Jeu j4 = new Jeu("Pokemon rouge",nintendoDs);
		Jeu j5 = new Jeu("Smash Bros",switchConsole);

	}

}
