package domaci;

public class Vozac {
	public String ime;
	public String prezime;
	public int brLicneKarte;
	
	public Vozac() {
		
	}
	public Vozac(String ime, String prezime, int brLicneKarte){
		this.ime = ime;
		this.prezime = prezime;
		this.brLicneKarte = brLicneKarte;
	}
	public String toString() {
		return "Ime:"+ime+"Prezime:"+prezime+"Br. licne:"+brLicneKarte;
		}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getBrLicneKarte() {
		return brLicneKarte;
	}
	public void setBrLicneKarte(int brLicneKarte) {
		this.brLicneKarte = brLicneKarte;
	}
	
	
	
	
}
