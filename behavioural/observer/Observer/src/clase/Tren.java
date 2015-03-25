package clase;

import java.util.ArrayList;
import java.util.List;

import interfete.Observer;
import interfete.Subject;

public class Tren implements Subject {

	private List<Observer> observatori=new ArrayList<Observer>();
	private String mesaj="";
	private int nrTren;
	
	public void intraInGara(){
		this.mesaj="Trenul "+nrTren+" intra in gara";
		notifica();
	}
	
	public void pleaca(){
		this.mesaj="Trenul "+nrTren+" pleaca din gara";
		notifica();
	}
	
	public Tren(int nrTren) {
		this.nrTren = nrTren;
	}

	@Override
	public void adaugaObserver(Observer o) {
		observatori.add(o);
	}

	@Override
	public void stergeObserver(Observer o) {
		observatori.remove(o);
	}

	@Override
	public void notifica() {
		for(Observer o:observatori){
			o.update(mesaj);
		}
	}
	


}
