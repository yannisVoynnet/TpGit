package nintendo.model;

import java.time.LocalDate;

public class Portable extends Console{

	public Portable(String nom, double prix, LocalDate dateDeSortie) {
		super(nom, prix, dateDeSortie);
	}

	@Override
	public String toString() {
		return "Portable []";
	}
	
}
