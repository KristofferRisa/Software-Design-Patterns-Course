package controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import easylib.controller.SuperAction;
import easylib.controller.Usecase;

class ATidy extends SuperAction {

	ATidy(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "Utfør Tidy");
		putValue(Action.LONG_DESCRIPTION, "Utfør tidy på venstre panel");
		setEnabled(false);
	}

	public void actionPerformed(ActionEvent e) {
		Controller.tidy();
	}

}
