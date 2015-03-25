package main;

import clase.Caine;
import clase.CaineBuilder;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Caine c1=new CaineBuilder().Inaltime(30).Culoare("rosu").build();
			System.out.println(c1.toString());

	}

}
