package gui.domain;

import java.awt.*;
import java.util.*;

public class OpticalZoom extends MoveableComponent implements Observer {
	
	private static final long serialVersionUID = 1110;
	private Image img;
	private int WIDTH = 100;
	private int HEIGHT = 100;
	private double zoom = 100;
	private Rectangle rectangle;
	private int startX;
	private int startY;
	private int endX;
	private int endY;
	
	public OpticalZoom(Image i) {
		setSize(WIDTH,HEIGHT);
		setLocation(0,0);
		img = i;
	}
	
	public void paint(Graphics g) {
		// Calculates and updates the postion based on zoom
		updatePostion();
		
		// Draws the image
		g.drawImage(img
				, 0, 0
				, WIDTH, HEIGHT 
				, startX , startY
				, endX, endY	
				, null);

		// Marks the lens by drawing a colored rectangle around it
		g.setColor(Color.GREEN);
		g.drawRect(0, 0, WIDTH, HEIGHT);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		zoom = (int)(arg);		
		System.out.println("Zoom level = " + + (int)arg);
		repaint();
	}

	private void updatePostion() {
		double newHeight = HEIGHT / 2;
	    double newWidth = WIDTH / 2;
	    double scale = (zoom / 100);
	    double halfWidth = ((WIDTH / scale) / 2);
	    double halfHeight = ((HEIGHT / scale) /2);
	    
	    rectangle = new Rectangle((int)(getX() + newWidth), (int)(getY() + newHeight)
    			, WIDTH , HEIGHT);
	  
	    System.out.println("Rectangle: " + rectangle);
	    
	    startX = (int) (rectangle.x - halfWidth);
		startY = (int) (rectangle.y - halfHeight);
		endX = (int) (rectangle.x + halfWidth);
		endY = (int) (rectangle.y + halfHeight);
	}
}
