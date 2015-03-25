package client;

import interfete.IFilm;
import clase.*;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IFilm film=new Film("How to train your dragon");
		APelicula clip=new Pelicula(film);
		clip.play();
		clip.pause();
		clip.resume();
		
		film=new VideoClip("Delia - Pe aripi de vant");
		clip=new Pelicula(film);
		clip.play();
		clip.pause();
		clip.resume();
	}

}
