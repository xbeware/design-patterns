package clase;

public class AnimalFactory {
	
	public Animal createInstance(Animale animal){
		switch(animal){
		case Caine: return new Caine();
		case Pisica:return new Pisica();
		case Porcusor: return new Porcusor();
		case Hamster: return new Hamster();
		}
		return null;
	}

}
