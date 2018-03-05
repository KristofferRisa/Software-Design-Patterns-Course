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
 * @author segovia
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class AInsert extends SuperAction {

	public AInsert(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "plasser ny figur");
		putValue(Action.LONG_DESCRIPTION, "plasser en ny figur på tegneflaten");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.insert(e);
	}

}
