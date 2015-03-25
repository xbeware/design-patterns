package program;

import clase.CaineCreator;
import clase.PisicaCreator;
import interfete.IAnimal;
import interfete.IAnimalCreator;

public class ProgramPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
IAnimalCreator creator=new PisicaCreator();
IAnimal animal=creator.createObject();
System.out.println(animal.vorbeste());
creator=new CaineCreator();
 animal=creator.createObject();
System.out.println(animal.vorbeste());
	}

}
