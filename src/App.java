
public class App {

	public static void main(String[] args) {
		
		Genre fantastisch = new Genre("Fantastisch");
		Genre action = new Genre("Action");		
		Autor markusHeinz = new Autor("Markus","Heinz");
		Regisseur whoKnows = new Regisseur("Who","Knows");
		
		
		Medium buch1 = new Ebook("Die Zwerge",markusHeinz,fantastisch,2011,"Lesenswert",300,5,"345234234");
		Medium buch2 = new Ebook("Die Orks",markusHeinz,fantastisch,2014,"Sehr Lesenswert",320,2,"345234434");
		
		Medium film1 = new Film("Stirb langsam",action,1986, whoKnows,126,false,false,"Klassiker");
		Medium film2 = new Film("Stirb langsam2",action,1986, whoKnows,126,false,false,"Klassiker");
		
		
		Medienbibliothek medienbibliothek = new Medienbibliothek();
		medienbibliothek.addMedium(buch1);
		medienbibliothek.addMedium(buch2);
		medienbibliothek.addMedium(film1);
		medienbibliothek.addMedium(film2);
		
		medienbibliothek.alleAusgeben();
		
		medienbibliothek.searchMedium("Die Orks");
		
	}

}
