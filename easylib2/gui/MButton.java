package easylib.gui;

import javax.swing.JButton;

import easylib.controller.SuperAction;

public class MButton extends JButton {

	public MButton(SuperAction a) {
		super(a);
		addMouseListener(a);
	}
}