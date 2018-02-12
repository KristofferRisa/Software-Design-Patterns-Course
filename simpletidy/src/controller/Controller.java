/*
 * Created on 18.jun.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package controller;

import easylib.controller.ISupercontroller;
import easylib.controller.SuperAction;
import easylib.controller.Supercontroller;
import gui.ApplicationFrame;

public class Controller extends Supercontroller implements IActionlist {

	public static SuperAction actionopen;
	public static SuperAction actiontidy;
	public static SuperAction actionsave;

	public static void init(ISupercontroller ui) {
		superinit(ui);
		actionopen = new AOpen(OPEN);
		actiontidy = new ATidy(TIDY);
		actionsave = new ASave(SAVE);
	}

	public static void open() {
		((ApplicationFrame)ui).open();
	}

	public static void tidy() {
		((ApplicationFrame)ui).tidy();
	}

	public static void save() {
		((ApplicationFrame)ui).save();
	}

	public static void enableActiontidy(boolean b) {
		actiontidy.setEnabled(b);
	}

	public static void enableActionsave(boolean b) {
		actionsave.setEnabled(b);
	}

}
