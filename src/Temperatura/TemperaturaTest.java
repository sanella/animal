package Temperatura;



public class TemperaturaTest {
public static void main(String[] args) {
	
	
	
	System.out.println();

	System.out.println("Ovo je konstruktor sa zadanim varijablama");
	Temperatura druga = new Temperatura(0 , "C", 0, 0 ,0);
	System.out.println(druga);
	
System.out.println("//////////////////");
	Temperatura prvaT = new Temperatura(10, "C");
	System.out.println(prvaT);
	prvaT.getCelsius();
	prvaT.getFarenheit();
	prvaT.getKelvin();
	
}
}
