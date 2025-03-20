package nintendo.model;

public class Boutique {
	
	private String nom;
	private String Adresse;
	
	
	public Boutique(String nom, String adresse) {
		this.nom = nom;
		Adresse = adresse;
		
		
		
	}


	public String getNom() {
		return nom;
	}


	public String getAdresse() {
		return Adresse;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setAdresse(String adresse) {
		Adresse = adresse;
	}


	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", Adresse=" + Adresse + "]";
	}
	
	

}
