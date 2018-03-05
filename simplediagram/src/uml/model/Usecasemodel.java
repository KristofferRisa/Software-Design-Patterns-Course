package uml.model;

import java.awt.Dimension;
import java.awt.Point;

import figure.graphics.EllipseElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

public class Usecasemodel extends Figuremodel {

	// Figuren plasseres p� en virtuell flate p� 1000X1000
	// Figurens m�l er innenfor en ny virtuell flate p� 1000X1000
	// Alle posisjoner og st�rrelser er i virtuelle m�l

	public Usecasemodel(int x, int y) {
		figureName = "Usecase";
		start = new Point(x, y);
		virtual = new Dimension(150, 80);
		elements.add(new EllipseElement(new Point(500, 978), new Point(920, 920),
				Hold.TRACE));
		elements.add(new TextElement("Brukstilfelle", LabelAlign.CENTER));
	}

	protected Figuremodel instance(int x, int y) {
		return new Usecasemodel(x, y);
	}

}
