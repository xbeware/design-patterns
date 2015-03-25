package clase;

import interfete.Observer;

public class Calator implements Observer {

	private String nume;
	
	public Calator(String nume){
		this.nume=nume;
		
	}
	@Override
	public void update(String mesaj) {
		System.out.println(nume+" ai un mesaj: "+mesaj);

	}

}
