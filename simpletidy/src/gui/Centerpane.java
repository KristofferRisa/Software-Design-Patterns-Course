/*
 * Created on 27.okt.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui;

import gui.domain.Domainview;

import java.awt.BorderLayout;

import javax.swing.JPanel;

class Centerpane extends JPanel {

	Domainview domainview;

	Centerpane() {
		setLayout(new BorderLayout());
		add(domainview = new Domainview());
	}

	void setDividers() {
		domainview.setDividers();
	}

	void open() {
		domainview.open();
	}

	void tidy() {
		domainview.tidy();
	}

	void save() {
		domainview.save();
	}

}
