package animal;

public class Skloniste {

	private Animal[] animals; // napravi niz zivotinja
	private int numAnimlas;

	private String imeSklonista;
	private static int ukupanBrZivotianje=0;
	
	public Skloniste() {
		animals = new Animal[2]; // niz ima 10 clanoca
		numAnimlas = 0;
		imeSklonista = "Nepoznato";
	}

	public Skloniste(String imeSklonista) {
		animals = new Animal[2]; // niz ima 10 clanoca
		numAnimlas = 0;
		this.imeSklonista= imeSklonista;
	}
	
	public void addAnimal(String name, String type, int numLegs) {
		animals[numAnimlas] = new Animal(name, type, numLegs);
		numAnimlas++;
		ukupanBrZivotianje++;
		if (numAnimlas == animals.length) {
			resizeAnimals();
		
		}
			
		}
	public static int getUkupanBrZivotinja(){ // GET ZA UKUPAN BROJ ZIVOTINJA U SKLONISTU
		return ukupanBrZivotianje;
	}
	
	public void resizeAnimals() {
		int newLength = 2 * animals.length;
		//int newLength = 2;
		Animal[] temp = new Animal[newLength];

		for (int i = 0; i < animals.length; i++) {
			temp[i] = animals[i];
		}
		animals = temp;

	}

	public void addAnimal(String name, String type) {
		addAnimal(name, type, 5);
		;
	}

	public String toString() { // TO STRING
		String sklonisteAsString = "";
		sklonisteAsString += imeSklonista + " \n" ;// dodali za druga sklonista
		for (int i = 0; i < numAnimlas; i++) {
			sklonisteAsString += animals[i].toString();

		}
		return sklonisteAsString;
	}

}
