package test;

import javax.swing.JFrame;

import svg.ISVGdiagram;

public class Testvindu extends JFrame {
	
	TestCenterpane centerpane;  
	
	public Testvindu(ISVGdiagram diagram) {
		super(diagram.diagramName());
		add(centerpane = new TestCenterpane(diagram));
		
	}
	

}
