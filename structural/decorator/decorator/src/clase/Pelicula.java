package clase;

import interfete.IFilm;


public class Pelicula extends APelicula {

	public Pelicula(IFilm _film) {
		super(_film);
	}

	@Override
	public void pause() {
		System.out.println(film.getDenumire() + " i s-a pus pauza");	
	}

	@Override
	public void resume() {
		System.out.println(film.getDenumire() + " a fost reluat");
	}

}
