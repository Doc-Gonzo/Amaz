/* Regisseur, Spielzeit, UHD, HD */
public class Film extends Medium {
	private Regisseur regisseur;
	private int spielzeit;
	private boolean uhd;
	private boolean hd;
	
	public Film (String title,Genre genre,int erscheinungsdatum,Regisseur regisseur, int spielzeit, boolean uhd, boolean hd, String kommentar) {
		super(title, genre, erscheinungsdatum);
		this.setSpielzeit(spielzeit);
		this.regisseur = regisseur;
		this.uhd = uhd;
		this.hd = hd;
		this.kommentar = kommentar; 
		
	}
	/* Bei Amazon ist es möglich Filme in HD UND UHD gleichzeitig zu besitzen, deshalb werden beide Felder ausgegeben */
	@Override
	public String toString() {
		return "Titel: " + title + ", Genre: " + genre + ", Erscheinungsdatum: " + erscheinungsdatum + ", Kommentar: " + kommentar + ", Spielzeit: " + " , Regisseur: " + regisseur.toString() + " , UHD: " + uhd + ", HD: " + hd;
	}
	@Override
	public String anzeigen () {
		String ausgabe = this.toString();
		return ausgabe;
	}
	@Override
	public void changeSpielzeit(int spielzeit) {
		this.setSpielzeit(spielzeit);
	}
	@Override
	public void changeRegisseur(Regisseur regisseur) {
		this.regisseur = regisseur;
	}
	@Override
	public void setUHD(boolean uhd) {
		this.uhd = uhd;
	}
	@Override
	public void setHD(boolean hd) {
		this.uhd = hd;
	}
	public int getSpielzeit() {
		return spielzeit;
	}
	public void setSpielzeit(int spielzeit) {
		this.spielzeit = spielzeit;
	}		
		
}
