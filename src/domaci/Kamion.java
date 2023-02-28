package domaci;


public class Kamion extends Vozilo {
	
	
	@Override
	public int cenaGoriva(int cenaL) {
		return cenaL * 16;
	}
	
	public Kamion() {
		
	}
	public Kamion(int brRegistracije, String proizvodjac, int godiste){
		super(brRegistracije,proizvodjac, godiste);
	}
	
	
	}

