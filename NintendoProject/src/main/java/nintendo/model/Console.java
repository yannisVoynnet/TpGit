package nintendo.model;

import java.time.LocalDate;

public abstract class Console {

	private String nom;
	private double prix;
	private LocalDate dateDeSortie;

	public Console(String nom, double prix, LocalDate dateDeSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateDeSortie = dateDeSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public LocalDate getDateDeSortie() {
		return dateDeSortie;
	}

	public void setDateDeSortie(LocalDate dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateDeSortie=" + dateDeSortie + "]";
	}
}
