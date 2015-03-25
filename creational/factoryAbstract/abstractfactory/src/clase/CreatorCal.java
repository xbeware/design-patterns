package clase;

import interfete.IAnimalCreator;
import interfete.IAnimalDePamant;
import interfete.IAnimaldeMare;

public class CreatorCal implements IAnimalCreator {

	@Override
	public IAnimalDePamant createAnimalDePamant() {
		// TODO Auto-generated method stub
		Cal c=new Cal();
		return c;
	}

	@Override
	public IAnimaldeMare createAnimalDeMare() {
		// TODO Auto-generated method stub
		
		CalDeMare cdm=new CalDeMare();
		return cdm;
	}

}
