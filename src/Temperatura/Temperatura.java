package Temperatura;

public class Temperatura {

	private double temperatura;
	private String tempFCK;
	private double celsius;
	private double kelvin;
	private double farenheit;



	public Temperatura(double temperatura, String tempFCK, double celsius,
			double kelvin, double farenheit) { // konstruktor prazni
		this.temperatura = temperatura;
		this.tempFCK = tempFCK;
		this.celsius = celsius;
		this.farenheit = farenheit;
		this.kelvin = kelvin;

	}

	public Temperatura(double temperatura, String tempFCK) { // KONSRUKTOR SA
																// ZADANOM
																// FIXNOM
																// VARIJABLOM
		this.temperatura = temperatura;
		this.tempFCK = tempFCK;
		this.setCelsius(temperatura);
		this.setFarenheit(temperatura);
		this.setKelvin(temperatura);
	}

	public String toString() { // TO STRING RADI ISPISA
		String tempToString = "Temperatura " + temperatura
				+ "; Vrsta sistema za mjerenje: " + tempFCK;
		return tempToString;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public String getTempFCK() {
		return tempFCK;
	}

	public double getCelsius() {

		if (tempFCK.equals("C")) {
			this.kelvin = temperatura + 273.15;
			this.farenheit = temperatura + 32;
			System.out.println(" Temperatura u K: " + kelvin);
			System.out.println(" Temperatura u F: " + farenheit);
		}
		return celsius;
	}

	public double getFarenheit() {

		if (tempFCK.equals("F")) {
			this.celsius = 32 + temperatura;
			this.kelvin = (temperatura + 459.67) * 5 / 9;
			System.out.println(" Temperatura u cels: " + celsius);
			System.out.println(" Temperatura u K : " + kelvin);

		}

		return farenheit;
	}

	public double getKelvin() {
		if (tempFCK.equals("K")) {
			this.celsius = temperatura - 273.15;
			this.farenheit = (temperatura - 273.15) * 1.8000 + 32.00;
			System.out.println("temperatura u C : " + celsius);
			System.out.println(" Temperatura u F: " + farenheit);
		}

		return kelvin;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}

	public void setFarenheit(double farenheit) {
		this.farenheit = farenheit;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public void setTempFCK(String tempFCK) {

		this.tempFCK = tempFCK;
	}

}
