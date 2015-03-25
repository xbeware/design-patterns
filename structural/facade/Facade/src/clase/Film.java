package clase;

public class Film {

	private String nume;

	public Film(String nume) {
		this.nume = nume;
	}
	
	public void selectFilm() {
		System.out.println("A fost selectat filmul: " + nume);
	}
	
	public void playFilm() {
		System.out.println(nume + " a inceput");
	}
}
