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

public class MenuController extends JMenuBar {

	public MenuController() {
		// Horisontal meny elements
		MMenu file = new MMenu("Fil");
		MMenu tool = new MMenu("Verktøy");
		MMenu help = new MMenu("Hjelp");

		// vertical file menu elements
		file.add(Controller.aexit);
	
		// vertical tool menu elements
		tool.add(Controller.actioncolor);
		tool.add(Controller.actionshape);

		// vertical help menu elements
		help.add(Controller.aabout);

		// fix vertical menu elements to this horizontal bar
		add(file);		
		add(tool);
		add(help);
	}

}
