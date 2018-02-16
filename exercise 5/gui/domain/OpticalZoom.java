package gui.domain;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;

public class OpticalZoom extends MoveableComponent implements Observer {
	
	Rectangle rectangle;
	private Image img;
	private int HEIGHT = 200;
	private int WIDTH = 200; 
	private double zoomLevel = 100;	
	
	public OpticalZoom(Image i) {
		rectangle = new Rectangle(HEIGHT,WIDTH);
		setSize(HEIGHT,WIDTH);
		setLocation(0,0);
		img = i;
	}
	
	public void paint(Graphics g) {
		
		double newHeight = img.getHeight(null) * zoomLevel / 100;
	    double newWidth = img.getWidth(null) * zoomLevel /100;
		
	    int diffHeight = (int)(img.getHeight(null) - newHeight);
	    int diffWidth = (int)(img.getWidth(null) - newWidth);
	    
	    System.out.println("org h = " + img.getHeight(null) + ". org w = " + img.getWidth(null));
	    System.out.println("Ny H = " + newHeight + ". Ny W = " + newWidth);
	    System.out.println("Diff høyde = " + diffHeight + " diff bredde = " + diffWidth + "\n");
	   
	    double centerOrgX = getX() + (WIDTH / 2) ;
	    double centerOrgY = getY() +  (HEIGHT / 2);
	    
	    System.out.println("CEnter org X = " + centerOrgX + ". Center org Y = " + centerOrgY);
	    
	    double zoomRatio =  zoomLevel / 100;
	    
	    double centerNyX = centerOrgX * zoomRatio; // zoomLevel / 100;
	    double centerNyY = centerOrgY * zoomRatio; // zoomLevel / 100;
	    
	    double diffCenterX = (centerOrgX - centerNyX);
	    double diffCenterY = (centerOrgY - centerNyY);
	    
	    // Test start postion
	    System.out.println("Diff X = " + diffCenterX + "\n Diff Y = " + diffCenterY + "\n");
	    
	    int startX = (int) (centerOrgX - (WIDTH/2) - (diffWidth/2));
	    int startY = (int)(centerOrgY - (HEIGHT /2) - (diffHeight/2));
	 
	    int endX = (int) (centerOrgX + (WIDTH/2) + (diffWidth/2));
	    int endY = (int)(centerOrgY + (HEIGHT /2) + (diffHeight/2));
	    
		g.drawImage(img
				, 0, 0
				, HEIGHT,WIDTH 
				
				, startX , startY
				, endX, endY	
				
				, null);
		    
		g.setColor(Color.GREEN);
		g.drawRect(0, 0, getWidth(), getHeight());
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		zoomLevel = (int)arg;
		System.out.println("zoom level = " + + (int)arg);
		repaint();
	}

}
