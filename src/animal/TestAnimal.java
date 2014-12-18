package animal;

public class TestAnimal {
	public static void main(String[] args) {

		
		System.out.println("Ovo je ispis bez varijabli, koristi prazni konstruktor");
		Animal maca = new Animal();
		System.out.println(maca);
		
		System.out.println();
		
		System.out.println("Ovo je konstruktor sa zadanim varijablama");
		Animal konj = new Animal("konj" , "konj", 5);
		System.out.println(konj);
		
		Animal zivotinja = new Animal("sijamska makcka" , "bird"); // ovo je ispis za dvije varijable a u konstruktor sam zadala da mi ispise 4
		System.out.println(zivotinja);
		
		System.out.println("-----------------------------");
		
		Skloniste sklonoste = new Skloniste();
		sklonoste.addAnimal("Pujdo", "dog");
		sklonoste.addAnimal("Cicko", "cat");
		sklonoste.addAnimal("Mrva", "bird");
		sklonoste.addAnimal("Molly", "bird");
		System.out.println(sklonoste.toString());
		
		Skloniste sklonosteBitCamp = new Skloniste("Camp");
		sklonosteBitCamp.addAnimal("Pujdo", "dog");
		sklonosteBitCamp.addAnimal("Cicko", "cat");
		sklonosteBitCamp.addAnimal("Mrva", "bird");
		sklonosteBitCamp.addAnimal("Molly", "bird");
		System.out.println(sklonosteBitCamp.toString());
		
		System.out.println(Skloniste.getUkupanBrZivotinja());
		
	}

}
