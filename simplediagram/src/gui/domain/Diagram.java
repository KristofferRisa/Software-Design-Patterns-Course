package gui.domain;

import figure.graphics.Figure;
import figure.model.Figuremodel;
import figure.model.Logic;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import svg.ISVGdiagram;
import svg.ISVGfigure;
import uml.graphics.Connection;
import uml.graphics.Thing;
import controller.Controller;

public class Diagram extends JPanel implements ISVGdiagram {

	private Design design = new Design();
	private String name;

	Diagram(String name) {
		this.name = name;
		setLayout(null);
		setBackground(Color.WHITE);
	}
	
	public void addFigure(Figuremodel fm) {
		Thing t = new Thing(fm);
		design.addFigure(t);
		add(t);
	}

	private void deleteFromConnectors(Figure figure) {
		ArrayList<Connection> con = new ArrayList<Connection>();
		for (Connection c : design.connectors) {
			if (c.has(figure)) {
				remove(c);
			} else {
				con.add(c);
			}
		}
		design.connectors = con;
	}

	public void deleteFigure(Figure figure) {
		if (Logic.deletable(figure, design.figures)) {
			deleteFromConnectors(figure);
			design.removeFigure(figure);
			design.removeConnector(figure);
			remove(figure);
		} else {
			Controller.setStatustext("Sletter ikke den siste!");
		}
		repaint();
	}

	public void finishConnection(Thing target) {
		add(design.finishConnection(target));
		repaint();
	}
	
	public void connect(Thing umlthing) {
		design.prepareConnection(umlthing);
	}

	public void setShadow(float d) {
		design.setShadow(d);
	}
	
	public void edtext(Thing figure) {
		figure.editTextelement();
	}

	public String diagramName() {
		return name;
	}

	public ArrayList<ISVGfigure> figureList() {
		return new ArrayList<ISVGfigure>(design.all());
	}

}
