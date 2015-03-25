package client;

import clase.CreatorCal;
import clase.CreatorPisica;
import interfete.IAnimalCreator;
import interfete.IAnimalDePamant;
import interfete.IAnimaldeMare;

public class ProgramPrincipal {

	/**
	 * @param args
	 */
	
	public static void afisari(IAnimalCreator creator){
		IAnimalDePamant adp=creator.createAnimalDePamant();
		IAnimaldeMare adm=creator.createAnimalDeMare();
		System.out.println(adp.descriere());
		System.out.println(adm.descriere());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
IAnimalCreator creator=new CreatorCal();
afisari(creator);
afisari(new CreatorPisica());

}}
