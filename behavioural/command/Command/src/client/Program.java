package client;

import clase.Film;
import clase.PauseCommand;
import clase.PlayCommand;
import clase.Player;
import clase.VideoClip;
import interfete.IClip;
import interfete.ICommand;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IClip clip = new Film();
		ICommand comanda=new PlayCommand(clip);
		Player player=new Player();
		player.invoca(comanda);
		player.invoca(comanda);
		player.invoca(comanda);
		clip=new VideoClip();
		comanda=new PauseCommand(clip);		
		player.invoca(comanda);
		clip=new Film();
		comanda=new PlayCommand(clip);
		player.invoca(comanda);
		
		player.undo();
		player.undo();
		player.undo();
		player.undo();
		player.undo();
		
		
	}

}
