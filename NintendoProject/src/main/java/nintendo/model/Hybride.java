package nintendo.model;

import java.time.LocalDate;

public class Hybride extends Console {

	public Hybride(String nom, double prix, LocalDate dateDeSortie) {
		super(nom, prix, dateDeSortie);
	}

	@Override
	public String toString() {
		return "Hybride []";
	}
	
	

}
