
public class Medium {
	protected String title;
	/* Alle Medien bekommen in der Web-App automatisch zugeschnittene Bilder (cropping) */
	/* So können sie gemischt in einem Slider, Akkordeon etc. angezeigt werden */
	/* private String imagePath; */
	protected String kommentar;	
	protected int erscheinungsdatum;
	protected Genre genre;
	
	public Medium (String title,Genre genre,int erscheinungsdatum) {
		kommentar = "empty";
		/* imagePath = "empty"; */
		this.erscheinungsdatum = erscheinungsdatum;
		this.title = title;
		this.genre = genre;
	}
	
	public String anzeigen() {
		String ausgabeString = this.toString();
		return ausgabeString;
	}

	@Override
	public String toString() {
		return "Titel: " + title + ", Genre: " + genre + ", Erscheinungsdatum: " + erscheinungsdatum + ", Kommentar: " + kommentar;
	}
	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}
	public String getKommentar() {
		return kommentar;
	}

	public void changeSpielzeit(int spielzeit) {}

	public void changeRegisseur(Regisseur regisseur) {}

	public void setUHD(boolean uhd) {}

	public void setHD(boolean hd) {	}

	public String anzeigen(Medium medium) {
		String ausgabe = medium.toString();
		return ausgabe;
	}

}
