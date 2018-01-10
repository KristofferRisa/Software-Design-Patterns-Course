package gui;

import gui.domain.Mainmenu;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controller.Controller;

public class ApplicationFrame extends JFrame {

	Centerpane centerpane;
	Northpane northpane;
	Southpane southpane;
	
	public ApplicationFrame() {		
		Controller.init(this);		
		setTitle("Enkel tekstbehandler");		
		add(northpane = new Northpane(),BorderLayout.NORTH);
		add(centerpane = new Centerpane());
		add(southpane = new Southpane(), BorderLayout.SOUTH);		
		setJMenuBar(new Mainmenu());		
		setSize(600,600);
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	
	public void open() {		
		centerpane.open();
	}

	public void save() {
		centerpane.save();		
	}	

	public void paste() {
		centerpane.paste();		
	}
		
}
