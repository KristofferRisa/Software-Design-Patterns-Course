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

/**
 * @author v. holmstedt
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class ALoadfiles extends SuperAction {

	public ALoadfiles(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "send til Min Datamaskin");
		putValue(Action.LONG_DESCRIPTION,
				"Hent det du tidligere har sendt til Felleslageret tilbake til Min Datamaskin");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.loadfiles();
	}

}
