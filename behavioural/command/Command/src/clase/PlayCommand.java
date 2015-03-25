package clase;

import interfete.IClip;
import interfete.ICommand;

public class PlayCommand implements ICommand {
	private IClip clip;
	
	public PlayCommand(IClip clip){
		this.clip=clip;
	}
	
	@Override
	public void execute() {
		clip.play();
	}

	@Override
	public void unexecute() {
		clip.stop();
		
	}

}
