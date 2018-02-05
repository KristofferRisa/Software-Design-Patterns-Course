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


class AShape extends SuperAction {

	AShape(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "Velg form");
		putValue(Action.LONG_DESCRIPTION, "Velg form på glasset");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.selectShape();
	}

}
