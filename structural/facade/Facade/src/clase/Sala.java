package clase;

public class Sala {

	private String nume;
	private Public publicul;
	
	public Sala(String nume) {
		super();
		this.nume = nume;
		this.publicul = new Public();
		this.publicul.add(new Persoana("P1"));
		this.publicul.add(new Persoana("P2"));
		this.publicul.add(new Persoana("P3"));

	}

	public void openDoor() {
		System.out.println("S-a deschis usa pentru sala " + nume);
		openLight();
		welcomeAudience();
		closeDoor();
		shutDownLight();
	}
	
	private void openLight() {
		System.out.println("In sala " + nume + " se aprinde lumina");
	}
	
	private void welcomeAudience() {
		System.out.println("Publicul intra in sala");
		publicul.enter();
	}
	
	private void closeDoor() {
		System.out.println("Pentru sala " + nume + " se inchide usa");;
	}
	
	private void shutDownLight() {
		System.out.println("In sala " + nume + " se stinge lumina");
	}
}
