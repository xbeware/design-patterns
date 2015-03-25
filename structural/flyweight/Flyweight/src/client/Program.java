package client;

import clase.CopacFactory;
import clase.Pozitie;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CopacFactory fabrica=new CopacFactory();
		Pozitie pozitie=new Pozitie(10, 20, 30);
		fabrica.getCopac("Pin").AfisareCopac(pozitie);
		fabrica.getCopac("Brad").AfisareCopac(pozitie);
		fabrica.getCopac("Pin").AfisareCopac(pozitie);
		fabrica.getCopac("Pin").AfisareCopac(pozitie);
		fabrica.getCopac("Brad").AfisareCopac(pozitie);
		System.out.println("Numarul de copaci: "+fabrica.getSize());
	}

}
