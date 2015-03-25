package clase;

public class Memento {
	private Angajat angajat;
	
	public Memento(Angajat a){
		angajat=new Angajat(a.getFunctie(), a.getSalariu());
	}
	
	public Angajat getAngajat(){
		return angajat;
	}

}
