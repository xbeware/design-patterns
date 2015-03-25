package ase;


import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MySingletonPopup extends JFrame {

	private JButton buton;
	static MySingletonPopup instanta=null;
	
	private MySingletonPopup(){
		super("Popup");
		this.setSize(370,100);
		this.setLayout (null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setComponents();
	}
	
	private void setComponents(){
		buton=new JButton((new Date()).toString());
		buton.setBounds(10, 30, 350, 25);
		buton.setToolTipText("Afiseaza text");
		this.add(buton);
	}
	
	public static MySingletonPopup getInstance()
	{
		if(instanta==null)
		{
			instanta=new MySingletonPopup();		
		}
		
		return instanta;
	}
	
}
