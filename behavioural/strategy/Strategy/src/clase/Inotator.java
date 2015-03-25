package clase;

import interfete.ModInotare;

public class Inotator {
	private String nume;
	private ModInotare stil;
	
	public Inotator(String nume){
		this.nume=nume;
	}
	
	public void inoata(){
		stil.inoata(nume);
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public ModInotare getStil() {
		return stil;
	}

	public void setStil(ModInotare stil) {
		this.stil = stil;
	}
}
