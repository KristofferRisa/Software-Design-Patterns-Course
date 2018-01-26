/*
 * Created on 14.jun.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package easylib.controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;


class AExit extends SuperAction {

	AExit(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "Stopper programmet");
		putValue(Action.LONG_DESCRIPTION, "Lukker vindu og stopper programmet");
	}

	public void actionPerformed(ActionEvent e) {
		Supercontroller.exit();
	}

}
