/*
 * Created on 14.sep.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui;

import gui.domain.Domainview;

import java.awt.BorderLayout;

import javax.swing.JPanel;

/**
 * @author Viggo
 * 
 */
public class Centerpane extends JPanel {

	private Domainview domainview;

	public Centerpane() {
		setLayout(new BorderLayout());
		add(domainview = new Domainview());
	}

	public void putline(String s) {
		domainview.putline(s);
	}

	public void storefiles() {
		domainview.storefiles();		
	}

	public void loadfiles() {
		domainview.loadfiles();		
	}

	void refresh() {
		domainview.refresh();
	}

	public void password() {
		domainview.password();
	}

	public void storeproperties() {
		domainview.storeproperties();
	}

	public void editproperties() {
		domainview.editproperties();
	}

}
