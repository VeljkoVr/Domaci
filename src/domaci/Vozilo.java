package domaci;

public class Vozilo {
	public int brRegistracije;
	public String proizvodjac;
	public int godiste;

	public int cenaGoriva(int cenaL) {
		return cenaL * 8;
	}
	public Vozilo() {
		
	}
	public Vozilo(int brRegistracije, String proizvodjac, int godiste){
		this.brRegistracije = brRegistracije;
		this.proizvodjac = proizvodjac;
		this.godiste = godiste;
	}

	@Override
	public String toString() {
		return "Godiste:"+godiste+"marka:"+proizvodjac+"Br. registracije:"+brRegistracije;
		}


	public int getBrRegistracije() {
		return brRegistracije;
	}
	public void setBrRegistracije(int brRegistracije) {
		this.brRegistracije = brRegistracije;
	}
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
}
