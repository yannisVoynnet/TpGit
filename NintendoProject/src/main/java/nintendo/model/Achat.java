package nintendo.model;

import java.time.LocalDateTime;

public class Achat {

	private Jeu jeu;
	private LocalDateTime date;
	private int prix;
	
	public Achat(Jeu jeu, LocalDateTime date, int prix) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}
	
	public Jeu getJeu() {
		return jeu;
	}
	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", prix=" + prix + ", date=" + date + "]";
	}
}
