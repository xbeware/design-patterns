package clase;

import interfete.IAnimal;
import interfete.IAnimalCreator;

public class PisicaCreator implements IAnimalCreator {

	@Override
	public IAnimal createObject() {
		Pisica pisica = new Pisica();
		return pisica;
	}

}
