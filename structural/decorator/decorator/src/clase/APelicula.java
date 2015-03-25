package clase;

import interfete.IFilm;

	public abstract class APelicula {
		IFilm film;
		public abstract void pause();
		public abstract void resume();
		public APelicula(IFilm _film){
			film=_film;
		}
//					+
//					+
	
	

	public void play() {
		film.play();
	}
	public void stop() {
		film.stop();
	}
}
