package clase;

import java.util.ArrayList;

public class CareTaker {
	
	private ArrayList<Memento> mementos=new ArrayList<Memento>();
	
	
	public void adaugaMemento(Memento m){
		mementos.add(m);
	}
	
	public Memento getMemento(int i){
		return mementos.get(i);
	}

}
