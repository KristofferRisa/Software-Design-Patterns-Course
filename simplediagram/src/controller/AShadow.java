package controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import easylib.controller.SuperAction;
import easylib.controller.Usecase;

public class AShadow extends SuperAction {

	public AShadow(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "regulerer alpha");
		putValue(Action.LONG_DESCRIPTION,
				"Reguler visning av berøringsområdet for figuren");
	}

	public void actionPerformed(ActionEvent e) {	
		Controller.shadow(e);
	}

}
