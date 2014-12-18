public class Toy {
	private String name;
	private String type;
	private int price;
	private int godPr;
	private int godDob;
	private int kolicina;

	public Toy(String name, String type, int price) { // konstruktor
		this.name = name;
		this.type = type;
		this.price = price;
		this.godPr = 2014;
		this.godDob = 0;
		this.kolicina = 0;
	}

	public Toy(String name, String type, int price, int godPr, int godDob, int kolicina) { // konstruktor
		this.name = name;
		this.type = type;
		this.price = price;
		this.godPr = godPr;
		this.godDob = godDob;
		this.kolicina = kolicina;
	}

	public Toy(String name, String type, int price, int jednoIliDrugo, int kolicina) { // konstruktor
		this.name = name;
		this.type = type;
		this.price = price;

		if (jednoIliDrugo > 1000) {
			this.godPr = jednoIliDrugo;
			this.godDob = 0;
		} else if (jednoIliDrugo < 100) {
			this.godDob = jednoIliDrugo;
			this.godPr = 2014;
		} else {
			this.godDob = 0;
			this.godPr = 2014;
		}

		this.kolicina = kolicina;
	}

	public String toString() { // TO STRING RADI ISPISA
		String toyToString = "Ime igracke " + name + "; Tip igracke: " + type
				+ "; Cijena " + price + "; Godina proizvodnje " + godPr
				+ "; Dob:" + godDob + "; kolicina na skaldistu: " + kolicina;
		return toyToString;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getGodPr() {
		return godPr;
	}

	public void setGodPr(int godPr) {

		this.godPr = godPr;
	}

	public int getGodDob() {
		return godDob;
	}

	public void setGodDob(int godDob) {
		this.godDob = godDob;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	
	
	
}
