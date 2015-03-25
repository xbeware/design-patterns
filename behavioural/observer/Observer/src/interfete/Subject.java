package interfete;

public interface Subject {	
	public void adaugaObserver(Observer o);
	public void stergeObserver(Observer o);
	public void notifica();
}
