package gui.domain;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import controller.Controller;

public class Helper {

	String[] SHAPES = { "Firkant", "Ellipse" };
	String shape = SHAPES[0];	
	MoveableGlass glass = null;

	public Helper(MoveableGlass glass) {
		this.glass = glass;
	}

	public void selectColor() {
		Color c = glass.getForeground();
		String tekst = Controller.actioncolor.longDescription();		
		if ((c=JColorChooser.showDialog(glass, tekst, c)) != null)
			glass.setForeground(c);
	}

	public void selectShape() {
		String tekst = Controller.actionshape.longDescription();
		Object o = JOptionPane.showInputDialog(null, "Velg", tekst,
				JOptionPane.INFORMATION_MESSAGE, null, SHAPES, shape);
		if (o != null) {
			shape = o.toString();
		}
	}
	
	public void paint(Graphics g) {
		if (shape.equals(SHAPES[0])) {
			g.fillRect(0, 0, glass.getWidth(), glass.getHeight());
		} else if (shape.equals(SHAPES[1])) {
			g.fillOval(0, 0, glass.getWidth(), glass.getHeight());
		}
	}
	

}
