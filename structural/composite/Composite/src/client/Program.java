package client;

import clase.Buchet;
import clase.Floare;

public class Program {
	public static void main(String [] args){
		Floare lalea1=new Floare("Lalea", "rosie"); 
		Floare lalea2=new Floare("Lalea", "galbena"); 
		Floare trandafir=new Floare("Trandafir", "rosie");
		Floare crin=new Floare("Crin", "alba");  
		Floare crizantema=new Floare("Crizantema", "rosie"); 
		
		Buchet buchetMic=new Buchet("verde");
		buchetMic.add(lalea1);
		buchetMic.add(lalea2);
		buchetMic.add(trandafir);
		
		Buchet bMic=new Buchet("Alba");
		bMic.add(crin);
		bMic.add(crizantema);
		
		Buchet buchetMare=new Buchet("Rosu");
		buchetMare.add(buchetMic);
		buchetMare.add(bMic);
		
		buchetMare.descriere();
	}
}
