package clase;

public class Caine {

	
	public String nume;
	public int varsta;
	public int greutate;
	public String culoare;
	public int inaltime;
	
	public Caine(){
		super();
		this.nume="rex";
		this.varsta=3;
		this.greutate=4;
		this.culoare="nigga";
		this.inaltime=70;
	}

	public Caine(String nume, int varsta, int greutate, String culoare,
			int inaltime) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.greutate = greutate;
		this.culoare = culoare;
		this.inaltime = inaltime;
	}

	@Override
	public String toString() {
		return "Caine [nume=" + nume + ", varsta=" + varsta + ", greutate="
				+ greutate + ", culoare=" + culoare + ", inaltime=" + inaltime
				+ "]";
	}
	
	
	
	
}
