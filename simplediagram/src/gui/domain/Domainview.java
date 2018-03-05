package gui.domain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import svg.Svg;
import uml.graphics.Thing;
import uml.model.Actormodel;
import uml.model.Usecasemodel;
import figure.graphics.Figure;
import figure.model.IFigure;

public class Domainview extends JPanel implements IFigure {

	private Diagram diagram = new Diagram("Brukstilfeller og aktører");
	private Shadow sh = new Shadow();

	public Domainview() {
		setLayout(new BorderLayout());
		add(diagram);
		add(sh, BorderLayout.SOUTH);
		diagram.addFigure(new Actormodel(100, 50));
		diagram.addFigure(new Usecasemodel(200, 55));
		setShadow(Shadows.LOW.f());
		setBackground(Color.WHITE);
	}
	
	private Figure figureSource(ActionEvent e) {
		Component c = (Component) e.getSource();
		JComponent jc = (JComponent) c.getParent();
		return (Figure) ((JPopupMenu) jc).getInvoker();
	}
	
	public void insertFigure(ActionEvent e) {
		diagram.addFigure(figureSource(e).newInstance());
		repaint();
	}

	public void connect(ActionEvent object) {
		diagram.connect((Thing) figureSource(object));
		repaint();
	}

	public void setShadow(float d) {
		diagram.setShadow(d);
	}

	public void deleteFigure(ActionEvent e) {
		diagram.deleteFigure(figureSource(e));
	}

	public void shadow(ActionEvent e) {
		sh.setVisible(((AbstractButton)e.getSource()).isSelected());		
	}

	public void storesvg() {
		new Svg().store(diagram);
	}
	
	public void edtext(ActionEvent e) {
		diagram.edtext((Thing) figureSource(e));
	}

	public void finishConnection(Object e) {
		diagram.finishConnection((Thing) e);
	}

}
