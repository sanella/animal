package animal;

public class Animal {

	private String name;
	private String type;
	private int numLegs;

	public Animal() { // KONSTRUKTOR POCETNI
		this.name = "nepoznat";
		this.type = "nepoznat";
		this.numLegs = 0;
	}

	public Animal(String name, String type, int numLegs) {
		this.name = name;
		this.setType(type);
		this.setNumLegs(numLegs);
	}

	public Animal(String name, String type) { // KONSRUKTOR SA ZADANOM FIXNOM
												// TRECOM VARIJABLOM
		this.name = name;
		this.setType(type);
		this.setNumLegs(10);
	}

	public String toString() { // TO STRING RADI ISPISA
		String animalString = "Name: " + name + ", Type: " + type
				+ ", NunLegs: " + numLegs;
		return animalString;
	}

	/**
	 * setName uzima novu vrijednost varijable ime 
	 * @param name vraca ima zivotinjice
	 */

	public void setName(String name) { // SETER
		this.name = name;
	}

	/**
	 * uzima novu vrijednost varijable tip 
	 * @param type vraza tip zivotinje
	 */
	public void setType(String type) { // SETER
		this.type = type;
	}

	/**
	 * uzima broj nogu i provjerava ovisno o tipu 
	 * @param numLegs vraca broj nogu
	 */
	public void setNumLegs(int numLegs) { // SETER SA PROVJEROM
		// ili numLegs = (numLegs>4 || numLegs <0) ? 4 : numLegs:
		if (this.type.equals("cat") || this.type.equals("konj")
				|| this.type.equals("dog")) {
			numLegs = (numLegs > 4 || numLegs < 0) ? 4 : numLegs;
		} else if (this.type.equals("bird")) {
			numLegs = (numLegs > 2 || numLegs < 0) ? 2 : numLegs;

		} else {
			numLegs = 0;
		}
		this.numLegs = numLegs;
	}

	public String getName() { // GET
		return name;
	}

	public String getType() {
		return type;
	}

	public int getNumLegs() {
		return numLegs;
	}

}
