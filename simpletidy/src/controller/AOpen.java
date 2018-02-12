package controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import easylib.controller.SuperAction;
import easylib.controller.Usecase;

class AOpen extends SuperAction {

	AOpen(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "Velg fil");
		putValue(Action.LONG_DESCRIPTION,
				"Velg htmlkode for tidy.exe");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.open();
	}

}
