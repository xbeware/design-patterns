package client;

import clase.APelicula;
import clase.Film;
import clase.Pelicula;
import interfete.IFilm;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFilm film = new Film("How to train your dragon");
		APelicula clip = new Pelicula(film);
		clip.play();
		clip.pause();
		clip.resume();
		
	}

}
