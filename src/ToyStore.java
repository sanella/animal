import animal.Animal;

public class ToyStore {

	private String imeProdavnice;
	private int inventar;
	private Toy[] nizIgracaka;
	private int brojIgracaka;
	private static int ukupanBrIgracaka = 0;

	public ToyStore() { // konstruktor
		this.imeProdavnice = "Nepoznato";
		this.inventar = 0;
		this.nizIgracaka = new Toy[3];

	}

	public ToyStore(String imeProdavnice, int inventar) { // konstruktor
		this.imeProdavnice = imeProdavnice;
		this.inventar = 0;
		this.nizIgracaka = new Toy[3];

	}

	public void addToy(String name, String type, int price, int godPr,
			int godDob, int kolicina) {
		nizIgracaka[brojIgracaka] = new Toy(name, type, price, godPr, godDob,
				kolicina);
		brojIgracaka++;
		ukupanBrIgracaka++;
		if (brojIgracaka == nizIgracaka.length) {
			resizeNizIgracaka();

		}

	}

	public static int getUkupanBrIgracaka() { // GET ZA UKUPAN BROJ igracaka U
												// SKLadsitu
		return ukupanBrIgracaka;
	}

	private void resizeNizIgracaka() {
		int newLength = 2 * nizIgracaka.length;

		Toy[] temp = new Toy[newLength];

		for (int i = 0; i < nizIgracaka.length; i++) {
			temp[i] = nizIgracaka[i];
		}
		nizIgracaka = temp;
	}

	public String toString() { // TO STRING RADI ISPISA
		String toyStoreToString = "Ime prodavnice " + imeProdavnice
				+ "; Invenatar: " + inventar;
		return toyStoreToString;

	}

	//public void ispisPoKolicini() {
		//int temp;
		//temp = Toy(kolicina);
		//for (int i = 0; i<nizIgracaka.length; i++){
			//nizIgracaka()
		//}
	//}
}
