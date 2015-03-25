package ro.ase.csie.cts;

import ro.ase.csie.cts.gadgets.AerConditionat;
import ro.ase.csie.cts.gadgets.AppleTV;
import ro.ase.csie.cts.gadgets.Ferestre;
import ro.ase.csie.cts.gadgets.InterfataGadgetGoogle;
import ro.ase.csie.cts.gadgets.ReteaElectrica;
import ro.ase.csie.cts.gadgets.SenzorTemperatura;
import ro.ase.csie.cts.patterns.AdaptorGadgetApple2Google;
import ro.ase.csie.cts.patterns.SmartHomeFacade;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InterfataGadgetGoogle[] gadgets = { new AerConditionat(),
				new Ferestre(), new ReteaElectrica(), new SenzorTemperatura(),
				new AdaptorGadgetApple2Google(new AppleTV()) };

		SmartHomeFacade smartHome = new SmartHomeFacade();
		smartHome.getStatus(gadgets);
		smartHome.pregatesteCasa(25, "10.10.10.1");
	}
}
