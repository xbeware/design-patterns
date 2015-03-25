package clase;

import java.util.ArrayList;

public class Public {

	ArrayList<Persoana> list = new ArrayList<>();
	
	public void add(Persoana p) {
		list.add(p);
	}
	
	public void enter() {
		for (int i = 0; i < list.size(); i++) {
			Persoana p = list.get(i);
			p.walk();
		}
	}
}
