package ase;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame implements ActionListener {

	private JButton buton;
	
	public MyWindow(){
		super("Window");
		this.setSize(400,300);
		this.setLayout (null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setComponents();
	}
	private void setComponents(){
		buton=new JButton("Apasa");
		buton.setBounds(150, 30, 100, 25);
		buton.addActionListener(this);
		buton.setToolTipText("Afiseaza text");
		this.add(buton);
	}
	
	public void actionPerformed(ActionEvent arg0) {		
/*		PopupFrame f=new PopupFrame();
		f.setVisible(true);*/
		
		MySingletonPopup popup=MySingletonPopup.getInstance();
		popup.setVisible(true);
	}
}


