package controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import easylib.controller.SuperAction;
import easylib.controller.Usecase;

public class AEdtext extends SuperAction {

	public AEdtext(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "rediger tekst");
		putValue(Action.LONG_DESCRIPTION, "rediger teksten i figuren");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.edtext(e);
	}

}
