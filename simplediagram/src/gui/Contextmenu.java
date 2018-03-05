/*
 * Created on 20.mar.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui;

import javax.swing.JPopupMenu;

import controller.Controller;

final public class Contextmenu extends JPopupMenu {

	public Contextmenu(boolean b) {
		if (b) {
			add(Controller.cnect).addMouseListener(Controller.cnect);
			add(Controller.insert).addMouseListener(Controller.insert);
			add(Controller.edtext).addMouseListener(Controller.edtext);
			addSeparator();
		}
		add(Controller.delete).addMouseListener(Controller.delete);
	}

}
