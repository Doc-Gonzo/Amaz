/* Autor, ISBN, Seitenanzahl, Auflage, Kommentar */
public class Ebook extends Medium {
	private Autor autor;
	private String isbn;
	private int seitenanzahl;
	private int auflage;

	
	public Ebook (String title,Autor autor,Genre genre,int erscheinungsdatum,String kommentar, int seitenanzahl, int auflage,String isbn) {
		super(title, genre, erscheinungsdatum);
		this.kommentar = kommentar; 
		this.seitenanzahl = seitenanzahl;
		this.isbn = isbn;
		this.auflage = auflage;
		this.autor = autor;
		
	}
	
	@Override
	public String toString() {
		return "Titel: " + title + ", Genre: " + genre + ", Autor: "  + autor.toString() + ", Erscheinungsdatum: " + erscheinungsdatum + ", Kommentar: " + kommentar + ", Seitenanzahl: "  + seitenanzahl + ", Auflage: " + auflage + ", ISBN: " + isbn;
	}
	@Override
	public String anzeigen(Medium medium) {
		String ausgabe = medium.toString();
		return ausgabe;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public int getSeitenanzahl() {
		return seitenanzahl;
	}

	public void setSeitenanzahl(int seitenanzahl) {
		this.seitenanzahl = seitenanzahl;
	}

	public int getAuflage() {
		return auflage;
	}

	public void setAuflage(int auflage) {
		this.auflage = auflage;
	}
 
		
}
