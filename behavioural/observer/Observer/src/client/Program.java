package client;

import clase.Calator;
import clase.Tren;

public class Program {

	public static void main(String[] args){
		Calator c1=new Calator("Popescu");
		Calator c2=new Calator("Vasile");
		
		Tren t=new Tren(777);
		t.adaugaObserver(c1);
		t.intraInGara();
		t.adaugaObserver(c2);
		t.pleaca();
		t.stergeObserver(c1);
		t.intraInGara();
		
	}
}
