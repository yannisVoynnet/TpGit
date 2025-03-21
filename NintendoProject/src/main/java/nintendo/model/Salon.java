package nintendo.model;

import java.time.LocalDate;

public class Salon extends Console{

	public Salon(String nom, double prix, LocalDate dateDeSortie) {
		super(nom, prix, dateDeSortie);
	}

	@Override
	public String toString() {
		return "Salon []";
	}
	
	

}
