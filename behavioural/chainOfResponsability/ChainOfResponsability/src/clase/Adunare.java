package clase;

public class Adunare extends Handler {

	@Override
	public void calculeaza(int numar) {
		int calculat=numar+numar;
		if(calculat>100){
			System.out.println("Prin adunare s-a obtinut: "+calculat);		
		}
		else{
			operatiaUrmatoare.calculeaza(numar);
		}

	}

}
