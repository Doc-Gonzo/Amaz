
public class Regisseur extends Person {
	
	public Regisseur(String vorname, String nachname) {
		super(vorname, nachname);
		
	}
	@Override
	public String toString() {
		return "Vorname: " + vorname + ", Nachname: " + nachname ;
	}
}
