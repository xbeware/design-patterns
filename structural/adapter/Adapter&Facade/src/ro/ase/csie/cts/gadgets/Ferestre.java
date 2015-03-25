package ro.ase.csie.cts.gadgets;

public class Ferestre implements InterfataGadgetGoogle{

	public String[] getFerestre() {
		return new String[] { "bucatarie", "dormitor", "sufragerie" };
	}

	public void deschideFereastra(String fereastra) {
		System.out.println("A fost deschisa fereastra " + fereastra);
	}

	public void inchide(String fereastra) {
		System.out.println("A fost inchisa fereastra " + fereastra);
	}

	@Override
	public boolean isWorking() {
		System.out.println("Ferestre deschise");
		return false;
	}
}
