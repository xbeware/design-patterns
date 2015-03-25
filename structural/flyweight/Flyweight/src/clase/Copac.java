package clase;

public class Copac {
	private String tip;
	
	public Copac() {
		this.tip = "Pin";
	}
	public Copac(String tip) {
		this.tip = tip;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public void AfisareCopac(Pozitie pozitie){
		System.out.println("Se planteaza un "+tip+" la pozitia("+pozitie.getPozitieX()+", "+pozitie.getPozitieY()+", "+pozitie.getPozitieZ()+")");
	}
}
