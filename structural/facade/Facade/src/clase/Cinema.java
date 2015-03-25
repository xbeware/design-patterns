package clase;

public class Cinema {

	private Sala sala;
	private Film film;
	
	public void difuzareFilmInSala(String sala, String film) {
		this.sala = new Sala(sala);
		this.film = new Film(film);
		this.film.selectFilm();
		this.sala.openDoor();
		this.film.playFilm();
	}

}
