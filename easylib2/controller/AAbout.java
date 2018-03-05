package easylib.controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;


class AAbout extends SuperAction {

	AAbout(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "om programmet");
		putValue(Action.LONG_DESCRIPTION, "versjon og annen relevant informasjon");
	}

	public void actionPerformed(ActionEvent e) {
		Supercontroller.about();
	}

}
