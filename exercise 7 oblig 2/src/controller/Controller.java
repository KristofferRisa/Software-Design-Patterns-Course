/*
 * Created on 14.sep.2005
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

	public static SuperAction aload;
	public static SuperAction astore;
	public static SuperAction aedprops;
	public static SuperAction astoreprops;
	public static SuperAction arefresh;
	public static SuperAction apassword;

	static public void init(ApplicationFrame ui) {
		superinit(ui);
		aload = new ALoadfiles(LOAD);
		astore = new AStorefiles(STORE);
		aedprops = new AEditproperties(EDITPROPS);
		astoreprops = new AStoreproperties(STRPROPS);
		arefresh = new ARefresh(REFRESH);
		apassword = new APassword(SETPASSWORD);
	}

	public static void loadfiles() {
		((ApplicationFrame) ui).loadfiles();
	}

	public static void storefiles() {
		((ApplicationFrame) ui).storefiles();
	}

	public static void editproperties() {
		((ApplicationFrame) ui).editproperties();
	}

	public static void storeproperties() {
		((ApplicationFrame) ui).storeproperties();
		refresh();
	}

	public static void refresh() {
		((ApplicationFrame) ui).refresh();
	}

	public static void password() {
		((ApplicationFrame) ui).password();
		refresh();
	}

	public static void putline(String l) {
		((ApplicationFrame) ui).putline(l);
	}

}
