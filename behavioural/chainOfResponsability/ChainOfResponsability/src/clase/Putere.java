package clase;

public class Putere extends Handler {

	@Override
	public void calculeaza(int numar) {
		int calculat = (int) Math.pow(numar, numar);
		if(calculat > 100) {
			System.out.println("Prin ridicare la putere s-a obtinut: " + calculat);		
		}
		else{
			System.out.println("Numarul este farte mic si nu se obtine un numar calculat suficient de mare");
		}

	}

}
