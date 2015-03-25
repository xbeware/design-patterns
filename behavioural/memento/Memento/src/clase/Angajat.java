package clase;

public class Angajat {
	private String functie;
	private int salariu;
	
	public Angajat(String functie, int salariu) {
		super();
		this.functie = functie;
		this.salariu = salariu;
	}
	
	@Override
	public String toString() {
		return "Angajat [functie=" + functie + ", salariu=" + salariu + "]";
	}
	
	public String getFunctie() {
		return functie;
	}
	public void setFunctie(String functie) {
		this.functie = functie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	
	

}
