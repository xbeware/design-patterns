package compositeexample;

public class TestComposite {

	public static void main(String[] args) {
		MenuComponent coffeMenu = 
				new Menu("Meniu cafea","Dinner");
		
		MenuComponent toateMeniurile = new Menu("Toate","Toate meniurile");
		toateMeniurile.add(coffeMenu);
		
		Restaurant rest = new Restaurant(toateMeniurile);
		rest.printMeniu();
		
	}

}
