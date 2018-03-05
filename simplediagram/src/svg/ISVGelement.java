package svg;

import java.awt.Point;
import java.util.ArrayList;

public interface ISVGelement {
	String renderable();
	ArrayList<String[]> attrList(Point offset);
	String label();
}
