/*
 * Created on 14.jun.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package controller;

import java.awt.event.ActionEvent;
import javax.swing.Action;
import easylib.controller.SuperAction;
import easylib.controller.Usecase;

class AColor extends SuperAction {

	AColor(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "Velg farge");
		putValue(Action.LONG_DESCRIPTION, "Velg farge p� glasset");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.selectGlassColor();
	}

}
