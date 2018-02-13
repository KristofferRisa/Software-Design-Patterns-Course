package gui.domain;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JPanel;

import controller.ObserverManager;

public class Domainview extends JPanel {

	Background background = new Background();
	MoveableGlass glassbehind = new MoveableGlass();
	MoveableGlass glassinfront = new MoveableGlass();
	OpticalZoom opticalZoom;

	public Domainview() {
		
		opticalZoom = new OpticalZoom(background.getImage());
		ObserverManager manager = ObserverManager.getInstance();
		manager.AddObserver(opticalZoom);
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

	public OpticalZoom getOpticalZoom() {
		return opticalZoom;
	}

}
