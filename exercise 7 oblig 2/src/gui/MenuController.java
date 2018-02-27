/*
 * Created on 19.mar.2005
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

		MMenu file = new MMenu("fil");
		MMenu tools = new MMenu("verktøy");		
		MMenu windows = new MMenu("vinduer");
		MMenu help = new MMenu("hjelp");

		file.add(Controller.aedprops);
		file.add(Controller.aexit);

		tools.add(Controller.aload);
		tools.add(Controller.astore);
		tools.addSeparator();
		tools.add(Controller.apassword);

		windows.add(Controller.arefresh);

		help.add(Controller.aabout);

		add(file);
		add(tools);		
		add(windows);
		add(help);
	}

}
