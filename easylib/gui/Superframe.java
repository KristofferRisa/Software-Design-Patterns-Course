package easylib.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import easylib.controller.ISupercontroller;


public abstract class Superframe extends JFrame implements ISupercontroller {
	
	protected Southpane southpane = null;
	
	protected Superframe() {		
		add((southpane = new Southpane()), BorderLayout.SOUTH);		
		setSize(900, 450);
		setLocationRelativeTo(null);		
	}
		
	public void setStatustext(String message) {
		southpane.setStatustext(message);
	}

	public void exit() {
		System.exit(0);
	}

	public void about(String about) {
		JOptionPane.showMessageDialog(null,
		about, "Om programmet", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
