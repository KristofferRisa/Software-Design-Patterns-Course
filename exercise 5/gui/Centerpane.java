package gui;

import gui.domain.Background;
import gui.domain.Domainview;
import gui.domain.OpticalZoom;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.Image;

import javax.swing.JPanel;

public class Centerpane extends JPanel {

	Domainview demopanel;

	public Centerpane() {
		setLayout(new BorderLayout());
		add(demopanel = new Domainview());
	}

	public void selectGlassColor() {
		demopanel.selectGlassColor();
	}

	public void selectShape() {
		demopanel.selectShape();
	}

	public Dimension getTheSize() {
		return demopanel.getTheSize();
	}

	public OpticalZoom getOpticalZoom() {
		return demopanel.getOpticalZoom();
	}

}
