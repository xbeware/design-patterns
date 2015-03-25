package client;

import clase.Butterfly;
import clase.Crawl;
import clase.Inotator;

public class Program {

	public static void main(String [] args){
		
		Inotator inotator=new Inotator("Alexandru Coci");
		inotator.setStil(new Butterfly());
		inotator.inoata();
		inotator.setStil(new Crawl());
		inotator.inoata();		
	}
}
