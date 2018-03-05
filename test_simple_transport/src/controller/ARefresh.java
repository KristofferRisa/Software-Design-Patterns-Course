/*
 * Created on 15.sep.2005
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
public class ARefresh extends SuperAction {

	public ARefresh(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "forny innholdet i fillistene");
		putValue(Action.LONG_DESCRIPTION,
				"Foreta ny innlesing og vis innholdet i begge lagrene på nytt");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.refresh();
	}

}
