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
public class AEditproperties extends SuperAction {

	public AEditproperties(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "rediger alle egenskaper");
		putValue(Action.LONG_DESCRIPTION,
				"Sett søkestier, brukernavn og maskinnavn som får systemet til å virke");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.editproperties();
	}

}
