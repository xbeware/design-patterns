package clase;

public abstract class Handler {
	protected Handler operatiaUrmatoare;
	
	public void setOperatiaUrmatoare(Handler operatie){
		operatiaUrmatoare=operatie;
	}	
	public abstract void calculeaza(int numar);
}


