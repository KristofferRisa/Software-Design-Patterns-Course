package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.Controller;
import easylib.controller.ISupercontroller;

public class ApplicationFrame extends JFrame implements ISupercontroller {

	Centerpane centerpane = null;
	Southpane southpane = null;
	ListOfLongExplanations listOfLongExlanations = null;

	public ApplicationFrame() {
		Controller.init(this);
		setTitle("Bevegelse med composite alpha p� bitmap");
		setLayout(new BorderLayout());
		add(centerpane = new Centerpane(), BorderLayout.CENTER);
		add(southpane = new Southpane(), BorderLayout.SOUTH);
		setJMenuBar(new MenuController());
		setSize(centerpane.getTheSize());
		setLocationRelativeTo(null);
		setVisible(true);
		
		listOfLongExlanations = new ListOfLongExplanations();
	}

	public void exit() {
		System.exit(0);
	}

	public void about() {
		JOptionPane.showMessageDialog(this, "Bevegelig glass 1.0");
	}

	public void selectGlassColor() {
		centerpane.selectGlassColor();
	}

	public void selectShape() {
		centerpane.selectShape();
	}

	public void setStatustext(String string) {
		if(!string.isEmpty()){
			southpane.setStatustext(string);
			listOfLongExlanations.append(string);
		}
	}

}
