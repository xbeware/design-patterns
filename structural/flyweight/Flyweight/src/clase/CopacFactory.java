package clase;

import interfete.Flyweight;

import java.util.HashMap;

public class CopacFactory implements Flyweight{
	private HashMap<String, Copac> copaci=new HashMap<String, Copac>();
	
	@Override
	public Copac getCopac(String tip){
		Copac copac=copaci.get(tip);
		if(copac==null){
			copac=new Copac(tip);
			copaci.put(tip, copac);
		}
		return copac;
	}
	
	public int getSize(){
		return copaci.size();
	}

}
