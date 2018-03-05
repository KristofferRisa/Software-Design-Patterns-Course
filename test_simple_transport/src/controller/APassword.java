/*
 * Created on 14.sep.2005
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
 * @author Viggo
 * 
 */
public class APassword extends SuperAction {

	public APassword(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "skriv inn passord");
		putValue(Action.LONG_DESCRIPTION,
				"Programmet husker passordet til programvinduet lukkes");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.password();
	}

}
