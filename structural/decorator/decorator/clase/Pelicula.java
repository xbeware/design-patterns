package clase;

import interfete.IFilm;

public class Pelicula extends APelicula{

	public Pelicula(IFilm _film){
		super(_film);
	}
	
	@Override
	public void pause() {
		System.out.println("Pause");
		
	}

	@Override
	public void resume() {
		System.out.println("Resume");		
	}

	@Override
	public void play() {
		System.out.println("Play");
		
	}
	
	

	
}
