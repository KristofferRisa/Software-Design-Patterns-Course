package figure.model;

import java.awt.Dimension;

final public class Scaler implements IFigure {

	public double hFactor;
	public double wFactor;

	public Scaler(Dimension dimension) {
		wFactor = dimension.getWidth() / VIRTUAL_WIDTH;
		hFactor = dimension.getHeight() / VIRTUAL_HEIGHT;
	}

}
