package ro.ase.csie.cts.gadgets;

public class ReteaElectrica implements InterfataGadgetGoogle {
	public void inchide() {
		System.out.println("Retea electrica oprita");
	}

	public void deschide() {
		System.out.println("retea electrica deschisa");
	}

	@Override
	public boolean isWorking() {
		System.out.println("Retea electrica pornita");
		return false;
	}
}
