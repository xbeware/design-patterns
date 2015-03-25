package clase;

import interfete.IPelicula;

public class FilmAdaptat implements IPelicula{

	Film film;
	
	public FilmAdaptat(Film film)
	{	this.film = film; }
	
	public void play() {	
		film.porneste();
	}

	public void stop() {
		film.opreste();
		
	}

}
