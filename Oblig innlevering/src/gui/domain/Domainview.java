package gui.domain;

import java.awt.Dimension;
import javax.swing.JPanel;
import controller.ZoomController;

public class Domainview extends JPanel {

	Background background = new Background();
	MoveableGlass glassbehind = new MoveableGlass();
	MoveableGlass glassinfront = new MoveableGlass();
	OpticalZoom opticalZoom;
	ZoomController zoomController;

	public Domainview() {
		
		opticalZoom = new OpticalZoom(background.getImage());
		zoomController = new ZoomController(opticalZoom);
		setLayout(null);
		add(opticalZoom);
		//add(glassinfront);
		add(background);
		//add(glassbehind);
		
	}

	public void selectGlassColor() {
		glassinfront.selectGlassColor();
	}

	public void selectShape() {
		glassinfront.selectShape();
	}

	public Dimension getTheSize() {
		return background.getSize();
	}

}
