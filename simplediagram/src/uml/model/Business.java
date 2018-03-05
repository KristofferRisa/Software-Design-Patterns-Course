package uml.model;

import java.awt.Point;

import figure.graphics.LineElement;
import figure.model.Figuremodel;

public class Business extends Usecasemodel {

	public Business(int x, int y) {
		super(x, y);
		elements.add(new LineElement(new Point(500, 950), new Point(950, 500),
				Hold.NONE));
	}

	protected Figuremodel instance(int x, int y) {
		return new Business(x, y);
	}

}
