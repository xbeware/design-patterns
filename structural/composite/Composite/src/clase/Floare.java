package clase;

public class Floare extends Planta{

	private String denumire;
	private String culoare;
	
	public Floare(String denumire, String culoare){
		this.denumire=denumire;
		this.culoare=culoare;
	}
	@Override
	public void descriere() {
		System.out.println(denumire+" este o floare de culoare "+culoare);		
	}

}
