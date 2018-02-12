package gui.domain;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;

public class OpticalZoom extends JComponent implements MouseMotionListener,Observer {
	
	Rectangle rectangle;
	private Image img;
	private int HEIGHT = 100;
	private int WIDTH = 100; 
	private int zoomLevel = 5;	
	Point offset;

	{
		addMouseMotionListener(this);
	}
	
	public OpticalZoom(Image i) {
		rectangle = new Rectangle(HEIGHT,WIDTH);
		setSize(HEIGHT,WIDTH);
		img = i;
	}
	
	public void paint(Graphics g) {
		
		int destx2 = rectangle.x  + HEIGHT;
		int desty2 = rectangle.y + WIDTH;
		System.out.println("destx2 =" + destx2 + ". desty2 = " + desty2);
		
		int offsetZoom =((WIDTH+HEIGHT)/4/2);
		System.out.println("zoom = " + offsetZoom);
		
		g.drawImage(img
				, 0, 0
				,HEIGHT+(zoomLevel * 10),WIDTH+(zoomLevel * 10)
				,rectangle.x+offsetZoom ,rectangle.y+offsetZoom
				, destx2,desty2
				, null);
	}
	

	
	public void updateRectangle(Point source) {
			
//		System.out.println("Source x = " + source.x);
//		System.out.println("Source y = " + source.y);
//		System.out.println("This location x = " + getLocation().x);
//		System.out.println("This location y = " + getLocation().y);
//		
		rectangle.x = source.x;//getLocation().x; //+ HEIGHT/2;
		rectangle.y = source.y; //getLocation().y; //+ WIDTH/2;
		System.out.println("Rectangle = " + rectangle);
		
	}
	
	public void mouseDragged(MouseEvent source) {
		System.out.println("Mouse point: " + source.getPoint());
		Point p = source.getPoint();
		Point l = getLocation();
		l.x += p.x - offset.x;
		l.y += p.y - offset.y;
		updateRectangle(getLocation());
		
		setLocation(l);
	}

	public void mouseMoved(MouseEvent source) {
		offset = source.getPoint();
	}

	@Override
	public void update(Observable o, Object arg) {
		zoomLevel = (int)arg;
		repaint();
	}

}
