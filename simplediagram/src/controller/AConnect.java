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
public class AConnect extends SuperAction {

	public AConnect(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "forbindelse ");
		putValue(Action.LONG_DESCRIPTION, "opprett forbindelse med annen figur");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.connect(e);
	}

}
