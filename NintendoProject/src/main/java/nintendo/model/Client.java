package nintendo.model;

import java.util.List;

public class Client {
	protected String nom;
	protected String prenom;
	protected List<Achat> listeAchats;
	
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public List<Achat> getListeAchats() {
		return listeAchats;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public void setListeAchats(List<Achat> listeAchats) {
		this.listeAchats = listeAchats;
	}


	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listeAchats=" + listeAchats + "]";
	}

	
	
	
}
