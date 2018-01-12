package gui.domain;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Texteditor extends JTextArea {
	
	public Texteditor() {
		getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				updateBackground();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				updateBackground();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				//Plain text components do not fire these events (https://docs.oracle.com/javase/tutorial/uiswing/events/documentlistener.html)
			}
			
		});
	}
	
	private void updateBackground() {
		if(getDocument().getLength() > 0)
			setBackground(new Color(240,240,140)); 
		else
			setBackground(new Color(255,255,255));
	}
	
}
