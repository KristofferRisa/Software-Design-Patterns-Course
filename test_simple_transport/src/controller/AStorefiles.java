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
public class AStorefiles extends SuperAction {

	public AStorefiles(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "send til Felleslageret");
		putValue(Action.LONG_DESCRIPTION,
				"Send filene du har redigert i Min Datamaskin over til Felleslageret");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.storefiles();
	}

}
