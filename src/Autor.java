
public class Autor extends Person {
	
	public Autor(String vorname, String nachname) {
		super(vorname, nachname);
		
	}
	@Override
	public String toString() {
		return "Vorname: " + vorname + ", Nachname: " + nachname ;
	}
}