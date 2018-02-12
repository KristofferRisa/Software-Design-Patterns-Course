package controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import easylib.controller.SuperAction;
import easylib.controller.Usecase;

class ASave extends SuperAction {

	ASave(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "velg filnavn");
		putValue(Action.LONG_DESCRIPTION, "Lagre høyre vindu");
		setEnabled(false);
	}

	public void actionPerformed(ActionEvent arg0) {
		Controller.save();
	}

}
