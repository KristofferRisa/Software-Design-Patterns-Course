package gui;

import gui.domain.Domainview;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Centerpane extends JPanel {

	Domainview demopanel;

	public Centerpane() {
		setLayout(new BorderLayout());
		add(demopanel = new Domainview());
	}

	public void selectGlassColor() {
		demopanel.selectGlassColor();
	}

	public void selectShape() {
		demopanel.selectShape();
	}

	public Dimension getTheSize() {
		return demopanel.getTheSize();
	}

}
