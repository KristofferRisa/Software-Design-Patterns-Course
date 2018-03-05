package svg;

import java.awt.Point;
import java.util.ArrayList;

/**
 * 
 * En UML-figur
 * 
 */
public interface ISVGfigure {
	String figureName();
	Point getLocation();
	ArrayList<ISVGelement> elementList();
}
