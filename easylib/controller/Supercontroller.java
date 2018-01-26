package easylib.controller;


public class Supercontroller implements ISuperlist {

	public static SuperAction aabout;
	public static SuperAction aexit;
	protected static ISupercontroller ui;

	protected static void superinit(ISupercontroller ui) {
		Supercontroller.ui = ui;
		aexit = new AExit(EXIT);
		aabout = new AAbout(ABOUT);
	}

	public static void about() {
		ui.about();
	}

	public static void exit() {
		ui.exit();
	}
	
	public static void setStatustext(String s) {
		ui.setStatustext(s);
	}

}
