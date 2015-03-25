package client;

import clase.Animal;
import clase.AnimalFactory;
import clase.Animale;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal;
		AnimalFactory animalFactory = new AnimalFactory();
		
		animal=animalFactory.createInstance(Animale.Caine);
		System.out.println(animal.toString());
		
		animal=animalFactory.createInstance(Animale.Hamster);
		System.out.println(animal.toString());
	}

}
