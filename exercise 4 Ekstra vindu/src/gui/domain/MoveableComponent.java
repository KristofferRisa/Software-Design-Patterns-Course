package gui.domain;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class MoveableComponent extends JComponent implements
		MouseMotionListener {

	Point offset;

	{
		addMouseMotionListener(this);
	}

	public void mouseDragged(MouseEvent source) {
		Point p = source.getPoint();
		Point l = getLocation();
		l.x += p.x - offset.x;
		l.y += p.y - offset.y;
		setLocation(l);
	}

	public void mouseMoved(MouseEvent source) {
		offset = source.getPoint();
	}

}
