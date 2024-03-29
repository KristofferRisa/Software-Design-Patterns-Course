package uml.model;

import java.awt.Dimension;
import java.awt.Point;

import figure.graphics.EllipseElement;
import figure.graphics.LineElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

public class Actormodel extends Figuremodel implements Cloneable {

	// Figuren plasseres p� en virtuell flate p� 1000X1000
	// Figurens m�l er innenfor en ny virtuell flate p� 1000X1000
	// Alle posisjoner og st�rrelser er i virtuelle m�l

	public Actormodel(int x, int y) {
		figureName = "Actor";
		start = new Point(x, y);
		reference = new Point(500, 180);
		Point arm = new Point(500, 220);
		Point leg = new Point(500, 480);

		virtual = new Dimension(100, 100);
		// venstre arm
		elements.add(new LineElement(arm, new Point(200, 500), Hold.END));
		// h�yre arm
		elements.add(new LineElement(arm, new Point(800, 500), Hold.END));
		// kroppen
		elements.add(new LineElement(reference, new Point(500, 470), Hold.NONE));
		// venstre bein
		elements.add(new LineElement(leg, new Point(350, 700), Hold.NONE));
		// h�yre bein
		elements.add(new LineElement(leg, new Point(650, 700), Hold.NONE));
		// hodet
		elements.add(new EllipseElement(reference, new Point(160, 160), Hold.NONE));
		elements.add(new TextElement("Bruker", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Actormodel(x, y);
	}

}
