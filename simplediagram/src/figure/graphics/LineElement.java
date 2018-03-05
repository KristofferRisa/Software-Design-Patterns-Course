package figure.graphics;

import java.awt.Point;
import java.awt.geom.Line2D;

import figure.model.Scaler;

public class LineElement extends ConnectElement {

	public LineElement(Point a, Point b, Hold c) {
		virtualstart = a;
		virtualstop = b;
		connectionrule = c;
	}

	public void realpixels(Scaler figscaler) {
		super.realpixels(figscaler);
		((Line2D.Double) element).setLine(realstart, realstop);
	}

	public boolean isHot(Point d) {
		return ((Line2D.Double) element).ptLineDist(d) < HOTDISTANCE;
	}

}
