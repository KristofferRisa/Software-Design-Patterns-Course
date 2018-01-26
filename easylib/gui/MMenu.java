package easylib.gui;

import javax.swing.JMenu;

import easylib.controller.SuperAction;

public class MMenu extends JMenu {

	public MMenu(String s) {
		super(s);
	}

	public void add(SuperAction a) {
		super.add(a).addMouseListener(a);
	}
}
