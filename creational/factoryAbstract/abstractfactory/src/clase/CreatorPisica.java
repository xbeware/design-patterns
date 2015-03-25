package clase;

import interfete.IAnimalCreator;
import interfete.IAnimalDePamant;
import interfete.IAnimaldeMare;

public class CreatorPisica implements IAnimalCreator{

	@Override
	public IAnimalDePamant createAnimalDePamant() {
		// TODO Auto-generated method stub
		
		Pisica p=new Pisica();
		return p;
	}

	@Override
	public IAnimaldeMare createAnimalDeMare() {
		// TODO Auto-generated method stub
		
		PisicaDeMare pdm=new PisicaDeMare();
		return pdm;
	}

}
