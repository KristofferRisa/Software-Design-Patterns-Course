package gui.domain;

import java.awt.*;
import java.util.*;

public class OpticalZoom extends MoveableComponent implements Observer {
	
	private static final long serialVersionUID = 1110;
	private Image img;
	private double scale = 100;
	private int WIDTH = 100;
	private int HEIGHT = 100;
	private double oldHeight;
	private double oldWidth;
	private double halfWidth = WIDTH/2;
	private double halfHeight = HEIGHT/2;
	private int startX;
	private int startY;
	private int endX;
	private int endY;
	
	public OpticalZoom(Image i) {
		setSize(HEIGHT,WIDTH);
		setLocation(0,0);
		img = i;
	}
	
	public void paint(Graphics g) {
		updatePostion();
		
		g.drawImage(img
				, 0, 0
				, HEIGHT,WIDTH 
				, startX , startY
				, endX, endY	
				, null);

		// Marks the lens by drawing a colored rectangle around it
		g.setColor(Color.GREEN);
		g.drawRect(0, 0, getWidth(), getHeight());
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// Sets the input parameter to "100 %" and add the arg value as percent
		// 1 = 101 % 
		scale = (int)(arg) + 100;
		repaint();
	}

	private void updatePostion() {
		if(scale > 100) {
			//Calculate new height and width based on scale or zoom
			double newHeight = img.getHeight(null) * scale / 100;
		    double newWidth = img.getWidth(null) * scale /100;

		    //Checks that the scale dosn't scale over the panel height and width
		    if(newHeight < (img.getHeight(null) + HEIGHT))
		    {
		    		 newHeight = img.getHeight(null) * scale / 100;
		    		 oldHeight = newHeight;
		    } else {
		    		newHeight = oldHeight;
		    }
		    
		    if(newWidth < (img.getWidth(null) + WIDTH))
		    {
		    		newWidth = img.getWidth(null) * scale /100;
		    		oldWidth = newWidth;
		    } else {
		    		newWidth = oldWidth;	
		    }
		    
		    //Calculate the difference between the original and scaled image
		    int diffHeight = (int)((img.getHeight(null) - newHeight)/2);
		    int diffWidth = (int)((img.getWidth(null) - newWidth)/2);
		    
		    // Finds center X and Y
		    double centerOrgX = getX() + halfWidth ;
		    double centerOrgY = getY() +  halfHeight;

		    //Sets start and ends coordinates for the scaled image
		    startX = (int) (centerOrgX - halfWidth - diffWidth);
		    startY = (int)(centerOrgY - halfHeight - diffHeight);
		    
		    endX = (int) (centerOrgX + halfWidth + diffWidth);
		    endY = (int)(centerOrgY + halfHeight + diffHeight);		    
		}
	}
}
