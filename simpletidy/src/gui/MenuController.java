/*
 * Created on 24.mai.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui;

import javax.swing.JMenuBar;

import controller.Controller;
import easylib.gui.MMenu;

class MenuController extends JMenuBar {

	MenuController() {	
		MMenu file = new MMenu("Fil");
		MMenu tool = new MMenu("Verktøy");
		MMenu help = new MMenu("Hjelp");

		file.add(Controller.actionopen);
		file.add(Controller.actiontidy);
		file.add(Controller.actionsave);
		file.add(Controller.aexit);

		tool.add(Controller.actiontidy);

		help.add(Controller.aabout);

		add(file);
		add(tool);
		add(help);
	}

}
