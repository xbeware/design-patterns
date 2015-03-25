package clase;

import java.util.ArrayList;

public class Buchet extends Planta{
	private ArrayList<Planta> flori=new ArrayList<Planta>();
	private String culoareAmbalaj;
	
	public Buchet(String culoareAmbalaj){
		this.culoareAmbalaj=culoareAmbalaj;
	}
	public void add(Planta planta){
		flori.add(planta);		
	}
	
	public void remove(Planta planta){
		flori.remove(planta);		
	}
	
	public Planta getChild(int i){
		return flori.get(i);
	}
	
	public void descriere(){
		System.out.println("Buchetul cu ambalaj de culoare: "
						+culoareAmbalaj
						+" contine urmatoarele flori:");
		for(Planta p:flori){
			p.descriere();
		}
	}
	

}
