package gui;

import gui.domain.Domainview;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

public class Centerpane extends JPanel {

	private Domainview domainview;

	public Centerpane() {
		setLayout(new BorderLayout());
		add(domainview = new Domainview());
		add(new JPanel(), BorderLayout.EAST); // dekor
		add(new JPanel(), BorderLayout.WEST); // dekor
	}

	public void insertFigure(ActionEvent e) {
		domainview.insertFigure(e);
	}

	public void connect(ActionEvent object) {
		domainview.connect(object);
	}

	public void setShadow(float d) {
		domainview.setShadow(d);
	}

	public void deleteFigure(ActionEvent f) {
		domainview.deleteFigure(f);
	}

	public void shadow(ActionEvent e) {
		domainview.shadow(e);
	}

	public void storesvg() {
		domainview.storesvg();
	}

	public void edtext(ActionEvent e) {
		domainview.edtext(e);
	}

	public void finishConnection(Object e) {
		domainview.finishConnection(e);
	}

}
