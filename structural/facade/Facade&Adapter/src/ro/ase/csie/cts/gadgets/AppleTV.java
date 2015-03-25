package ro.ase.csie.cts.gadgets;

public class AppleTV implements InterfataGadgetApple {

	@Override
	public int getStatus() {
		System.out.println("Media box Apple functioneaza");
		return 1;
	}
	
}
