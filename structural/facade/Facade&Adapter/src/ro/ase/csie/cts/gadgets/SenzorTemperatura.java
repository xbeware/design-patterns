package ro.ase.csie.cts.gadgets;

import java.util.Random;

public class SenzorTemperatura implements InterfataGadgetGoogle{
	public int getTemperatura() {
		Random random = new Random();
		return random.nextInt(40);
	}

	@Override
	public boolean isWorking() {
		System.out.println("Senzor temperatura pornit");
		return false;
	}
}
