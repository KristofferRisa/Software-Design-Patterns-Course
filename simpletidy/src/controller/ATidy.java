package controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import easylib.controller.SuperAction;
import easylib.controller.Usecase;

class ATidy extends SuperAction {

	ATidy(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "Utf�r Tidy");
		putValue(Action.LONG_DESCRIPTION, "Utf�r tidy p� venstre panel");
		setEnabled(false);
	}

	public void actionPerformed(ActionEvent e) {
		Controller.tidy();
	}

}
