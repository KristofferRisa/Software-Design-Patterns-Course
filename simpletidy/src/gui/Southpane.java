/*
 * Created on 18.jun.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author segovia
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
class Southpane extends JPanel {

	private JLabel status;

	Southpane() {
		setLayout(new GridLayout(1, 0));
		setBackground(Color.YELLOW);
		(status = new JLabel("", JLabel.CENTER)).setOpaque(false);
		status.setBorder(BorderFactory.createEtchedBorder());
		status.setFont(new Font("sansserif", Font.PLAIN, 12));
		add(status);
	}

	public void setStatustext(String message) {
		status.setText(message);
	}

}
