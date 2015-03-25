package clase;

import interfete.IPelicula;

public class FilmAdaptat implements IPelicula {
	private Film _film;
	public FilmAdaptat(Film film) {
		_film=film;
	}
	@Override
	public void play() {
		_film.porneste();
	}

	@Override
	public void stop() {
		_film.opreste();
	}

}
