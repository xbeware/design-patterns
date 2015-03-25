package clase;

import interfete.IFilm;

public class Film implements IFilm {
	private String denumire;
	
	public Film(String _denumire){
		denumire=_denumire;
	}

	@Override
	public void play() {
		System.out.println(denumire + " a pornit");
	}

	@Override
	public void stop() {
		System.out.println(denumire + " s-a oprit");
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

}
