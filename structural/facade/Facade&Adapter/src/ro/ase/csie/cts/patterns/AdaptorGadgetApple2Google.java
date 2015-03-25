package ro.ase.csie.cts.patterns;

import ro.ase.csie.cts.gadgets.InterfataGadgetApple;
import ro.ase.csie.cts.gadgets.InterfataGadgetGoogle;

public class AdaptorGadgetApple2Google implements InterfataGadgetGoogle {

	public InterfataGadgetApple gadgetApple;

	public AdaptorGadgetApple2Google(InterfataGadgetApple deviceApple) {
		this.gadgetApple = deviceApple;
	}

	@Override
	public boolean isWorking() {
		if (gadgetApple.getStatus() != 0)
			return true;
		return false;
	}

}
