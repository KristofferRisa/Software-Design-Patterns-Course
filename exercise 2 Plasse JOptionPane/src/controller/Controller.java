package controller;

import gui.ApplicationFrame;

public class Controller {
	
	static ApplicationFrame ui;
	
	public static void init(ApplicationFrame ui) {
		Controller.ui = ui;
	}

	public static void stop() {
		System.exit(0);		
	}

	public static void open() {	
		ui.open();		
	}

	public static void save() {
		ui.save();		
	}

	public static void paste() {
		ui.paste();		
	}
	
}
