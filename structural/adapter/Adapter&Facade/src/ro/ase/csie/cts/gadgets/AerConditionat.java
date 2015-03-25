package ro.ase.csie.cts.gadgets;

public class AerConditionat implements InterfataGadgetGoogle {
	public void porneste(int temperatura) {
		System.out.println("Aer conditionat pornit cu temperatura "
				+ temperatura);
	}

	public void opreste() {
		System.out.println("Aer conditionat oprit");
	}

	@Override
	public boolean isWorking() {
		System.out.println("Aer conditionat pornit");
		return false;
	}
}
