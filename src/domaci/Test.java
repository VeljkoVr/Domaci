package domaci;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vozac vozac1 = new Vozac();
		Vozac vozac2 = new Vozac("Petar", "Petrovic", 612764161);
		
		System.out.println(vozac2.toString());
		
		Vozilo vozilo1 = new Vozilo(2673562, "BMW", 2020);
		System.out.println(vozilo1.toString());
		
		Kamion kamion1 = new Kamion(424242, "Volvo", 2018);
		System.out.println(kamion1.toString());
		System.out.println( kamion1.cenaGoriva(200));
	}

}
