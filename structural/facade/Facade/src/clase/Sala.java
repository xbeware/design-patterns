package clase;

public class Sala {
	
	private String nume;
	
	public Sala(String _nume){
		nume=_nume;
	}
	
	public void stingeLumina(){
		System.out.println("In sala "+nume+" se stinge lumina");
	}
	
	public void aprindeLumina(){
		System.out.println("In sala "+nume+" se aprinde lumina");
	}
	
	public void deschideUsa(){
		System.out.println("S-a deschis usa pentru sala "+nume);
	}

	public void inchideUsa(){
		System.out.println("Pentru sala "+nume+" se inchide usa.");
	}

}
