package gui.domain;

import javax.swing.JTextArea;

public class Texteditor extends JTextArea {
	
	public Texteditor() {
		getDocument().addDocumentListener(new TexteditorListner(this));
	}
}
