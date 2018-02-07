package controller;

import easylib.controller.ISupercontroller;
import easylib.controller.SuperAction;
import easylib.controller.Supercontroller;
import gui.ApplicationFrame;

public class Controller extends Supercontroller implements IActionlist {

	public static SuperAction actioncolor;
	public static SuperAction actionshape;

	public static void init(ISupercontroller frame) {
		superinit(frame);
		actioncolor = new AColor(COLOR);
		actionshape = new AShape(SHAPE);
	}

	public static void selectGlassColor() {
		((ApplicationFrame)ui).selectGlassColor();
	}

	public static void selectShape() {
		((ApplicationFrame)ui).selectShape();
	}

}
