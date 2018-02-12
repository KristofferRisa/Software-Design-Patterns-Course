/*
 * Created on 27.okt.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Controller;
import easylib.controller.ISupercontroller;

/**
 * @author vh
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class ApplicationFrame extends JFrame implements ISupercontroller {

	private Southpane southPane = null;
	private Centerpane centerpane = null;
	static public String versionstring = "Tidyclient version 1.0";

	public ApplicationFrame() {

		Controller.init(this);
		setTitle(versionstring);
		setSize(900, 700);

		add(centerpane = new Centerpane());
		add(southPane = new Southpane(), BorderLayout.SOUTH);
		add(new JPanel(), BorderLayout.WEST); // margdekor
		add(new JPanel(), BorderLayout.EAST); // margdekor

		setJMenuBar(new MenuController());
		setLocationRelativeTo(null);
		setVisible(true);

		centerpane.setDividers(); // Composite
	}

	public void setStatustext(String message) {
		southPane.setStatustext(message);
	}

	public void exit() {
		System.exit(0);
	}

	public void about() {
		JOptionPane.showMessageDialog(null, versionstring, "",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void open() {
		centerpane.open();
	}

	public void tidy() {
		centerpane.tidy();
	}

	public void save() {
		centerpane.save();
	}

}
