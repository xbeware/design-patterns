package clase;

import interfete.IFilm;

public class Film implements IFilm {


	private String name;
	
	public Film(String name)
	{
		super();
		this.name = name;
	}
	
	@Override
	public void play() {
		System.out.println("Play");
	}

	@Override
	public void stop() {
		System.out.println("Stop");
	}

	@Override
	public String getDenumire() {
		return name;
	}

}
