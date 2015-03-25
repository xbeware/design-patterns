package clase;

import interfete.IAnimal;
import interfete.IAnimalCreator;

public class CaineCreator implements IAnimalCreator{

	@Override
	public IAnimal createObject() {
		Caine caine = new Caine();
		return caine;
	}

}
