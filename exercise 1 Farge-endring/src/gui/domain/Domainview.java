package gui.domain;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Domainview extends JPanel {

	Editorview editorview;
	
	public Domainview() {
		setLayout(new BorderLayout());
		add(editorview=new Editorview());		
	}
		
	public void open() {		
		editorview.open();
	}

	public void save() {
		editorview.save();		
	}

	public void paste() {
		editorview.paste();		
	}
	
}
