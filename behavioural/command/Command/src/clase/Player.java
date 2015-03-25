package clase;

import java.util.LinkedList;

import interfete.ICommand;

public class Player {
	LinkedList<ICommand> comenzi=new LinkedList<ICommand>();
	
	public void invoca(ICommand comanda){
		comenzi.add(comanda);
		comanda.execute();
	}
	
	public void undo(){
		comenzi.pollLast().unexecute();
	}

}
