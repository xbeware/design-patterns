package clase;

import interfete.IFilm;

public class VideoClip implements IFilm {

	private String denumire;
	public VideoClip(String _denumire){
		denumire=_denumire;
	}
	@Override
	public void play() {
		System.out.println(denumire + " a pornit");

	}

	@Override
	public void stop() {
		System.out.println(denumire + " a fost oprit");

	}

	@Override
	public String getDenumire() {
		return denumire;
	}

}
