package ro.ase.csie.cts.patterns;

import ro.ase.csie.cts.Computer;
import ro.ase.csie.cts.gadgets.AerConditionat;
import ro.ase.csie.cts.gadgets.Ferestre;
import ro.ase.csie.cts.gadgets.InterfataGadgetGoogle;
import ro.ase.csie.cts.gadgets.ReteaElectrica;
import ro.ase.csie.cts.gadgets.SenzorTemperatura;

public class SmartHomeFacade {

	public void getStatus(InterfataGadgetGoogle[] senzori) {
		for (InterfataGadgetGoogle senzor : senzori) {
			senzor.isWorking();
		}
	}

	public void pregatesteCasa(int temperatura, String server) {
		ReteaElectrica retea = new ReteaElectrica();
		retea.deschide();
		Computer computer = new Computer();
		computer.connect2Internet(server);
		SenzorTemperatura senzor = new SenzorTemperatura();
		if (senzor.getTemperatura() > temperatura) {
			AerConditionat aer = new AerConditionat();
			aer.porneste(temperatura);
		}

		Ferestre controlFerestre = new Ferestre();
		String[] ferestre = controlFerestre.getFerestre();
		for (String fereastra : ferestre) {
			controlFerestre.inchide(fereastra);
		}
	}
}
