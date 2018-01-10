/*
 * Created on 19.mar.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui.domain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.Controller;

public class Mainmenu extends JMenuBar implements ActionListener {
	
	JMenuItem open = new JMenuItem("åpne");
	JMenuItem save = new JMenuItem("lagre");
	JMenuItem exit = new JMenuItem("avslutt");
	JMenuItem paste = new JMenuItem("lim inn");	

	public Mainmenu() {
		// horisontale elementer
		JMenu file = new JMenu("fil");
		JMenu edit = new JMenu("rediger");		
		JMenu help = new JMenu("hjelp");

		// vertikale elementer 
		file.add(open).addActionListener(this);
		file.add(save).addActionListener(this);
		file.add(exit).addActionListener(this);

		edit.add(paste).addActionListener(this);
		
		add(file);
		add(edit);
		add(help);
	}

	public void actionPerformed(ActionEvent arg) {
		if (arg.getSource() == open) Controller.open();
		if (arg.getSource() == save) Controller.save(); 
		if (arg.getSource() == exit) Controller.stop();
		if (arg.getSource() == paste)Controller.paste();	
	}

}
