package controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import easylib.controller.SuperAction;
import easylib.controller.Usecase;

public class AStoresvg extends SuperAction {

	public AStoresvg(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "lagre som svg");
		putValue(Action.LONG_DESCRIPTION, "lagre som svg");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.storesvg();
	}

}
