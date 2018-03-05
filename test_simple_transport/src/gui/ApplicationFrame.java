package gui;

import java.awt.Cursor;

import controller.Controller;
import easylib.gui.Superframe;

/*
 * Created on 14.sep.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Viggo
 * 
 */




public class ApplicationFrame extends Superframe {

	private Centerpane centerpane = null;

	public ApplicationFrame() {	
		Controller.init(this);
		add((centerpane = new Centerpane()));
		setJMenuBar(new MenuController());		
		setVisible(true);
		refresh();
	}

	public void about() {		
		about("Filtransport\n\nversjon 1.0"); 
	}

	public void storefiles() {
		setcursor(Cursor.WAIT_CURSOR);
		centerpane.storefiles();
		setcursor(Cursor.DEFAULT_CURSOR);		
	}

	public void loadfiles() {
		setcursor(Cursor.WAIT_CURSOR);
		centerpane.loadfiles();
		setcursor(Cursor.DEFAULT_CURSOR);
	}

	public void editproperties() {
		centerpane.editproperties();
	}

	public void refresh() {
		setcursor(Cursor.WAIT_CURSOR);
		centerpane.refresh();
		setcursor(Cursor.DEFAULT_CURSOR);
	}

	public void putline(String l) {
		centerpane.putline(l);
	}

	public void storeproperties() {
		setcursor(Cursor.WAIT_CURSOR);
		centerpane.storeproperties();
		setcursor(Cursor.DEFAULT_CURSOR);
	}

	public void password() {
		centerpane.password();
	}
	
	private void setcursor(int cursor) {
		setCursor(Cursor.getPredefinedCursor(cursor));		
	}

}
