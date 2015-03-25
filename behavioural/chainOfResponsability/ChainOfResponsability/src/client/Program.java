package client;

import clase.Adunare;
import clase.Handler;
import clase.Inmultire;
import clase.Putere;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Handler adunare=new Adunare();
		Handler inmultire=new Inmultire();
		Handler putere=new Putere();
		adunare.setOperatiaUrmatoare(inmultire);
		inmultire.setOperatiaUrmatoare(putere);
		adunare.calculeaza(50);
		

	}

}
