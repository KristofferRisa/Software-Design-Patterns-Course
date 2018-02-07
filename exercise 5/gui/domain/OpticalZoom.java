package gui.domain;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class OpticalZoom extends MoveableComponent {

	final int WIDTH = 200;
	final int HEIGTH = 400;
	
	public OpticalZoom() {
		setSize(HEIGHT,WIDTH);
	}
	
	public void paint(Graphics g) {
		AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,);
		((Graphics2D) g).setComposite(ac);
		//helper.paint(g);
	}
}
