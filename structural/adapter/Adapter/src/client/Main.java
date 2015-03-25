package client;

import interfete.IPelicula;
import clase.Film;
import clase.FilmAdaptat;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Film film = new Film();
		IPelicula pelicula = new FilmAdaptat(film);
		pelicula.play();
		pelicula.stop();
	}

}
