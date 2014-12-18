import animal.Skloniste;



public class ToyTest {

	public static void main(String[] args) {
		
		
		
		Toy kamion = new Toy("trakor", "autic", 20);
		System.out.println(kamion.toString());
	
		Toy lopta = new Toy("teniska", "lopta", 20, 2000, 3 );
		System.out.println(lopta.toString());
		
		Toy auto = new Toy("Megane", "auto", 10, 2300, 5 );
		System.out.println(auto.toString());
		
		Toy barbika = new Toy("barbika", "beba", 100, 2000, 3 );
		System.out.println(barbika.toString());
		
		Toy knjiga = new Toy("HarryPotter", "knjiga", 500, 2000, 3 );
		System.out.println(lopta.toString());
		
		Toy zaba = new Toy("zaba", "zaba", 20, 2000, 3 );
		System.out.println(lopta.toString());
		
		System.out.println("-----------------------");
		
		
		ToyStore store1 = new ToyStore();
		store1.addToy("beba", "lutka", 20, 2013, 7, 20);
		store1.addToy("barbika", "lutka", 20, 2013, 7, 20);
		store1.addToy("SARA", "lutka", 20, 2013, 7, 20);
		store1.addToy("ELLA", "lutka", 20, 2013, 7, 20);
		
		ToyStore store2 = new ToyStore();
		store1.addToy("kamion", "auto", 20, 2013, 7, 20);
		store1.addToy("ferrari", "auto", 20, 2013, 7, 20);
		store1.addToy("Megane", "auto", 20, 2013, 7, 20);
		store1.addToy("traktor", "auto", 20, 2013, 7, 20);
		
		
		
		
		
		System.out.println(ToyStore.getUkupanBrIgracaka());

		
		
		
		
		
	
}
}