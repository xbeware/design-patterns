package clase;

import interfete.IClip;
import interfete.ICommand;

public class PauseCommand implements ICommand {
	private IClip clip;
	
	public PauseCommand(IClip clip){
		this.clip=clip;
	}
	
	@Override
	public void execute() {
		clip.pause();
	}

	@Override
	public void unexecute() {
		clip.resume();
		
	}


}
