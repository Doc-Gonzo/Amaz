import java.util.ArrayList;
import java.util.Scanner;
/* >, Methode mediumHinzufügen() , Methode zum Durchlaufen  */

public class Medienbibliothek {
	protected ArrayList<Medium> medienliste;
	protected Scanner scanner =  new Scanner(System.in);
	
	
	
	public Medienbibliothek() {
		medienliste = new ArrayList<Medium>();		
	}
	
	public void addMedium(Medium medium) {
		medienliste.add(medium);
	}
	/* Medium suchen */
	public void searchMedium(String title) { 
		for (Medium medium : medienliste) {
			if (title.contains(title)) {
				medium.anzeigen();
			}
			else {
				System.out.println("Leider nichts gefunden. Bitte versuchen Sie es noch einmal.");
			}
		}
		
	}
	/* Alle ausgeben */
	public void alleAusgeben() {
		for (Medium medium : medienliste) {
			System.out.println(	medium.anzeigen() );
				
		}	
	}
	/* Liste durchlaufen */
	public void listMedium () {
		for (Medium medium : medienliste) {
			medium.anzeigen();
			/* Folgender Scanner simuliert "Next-Button" */
			String dummyString =  scanner.nextLine();
		}
	}
}
