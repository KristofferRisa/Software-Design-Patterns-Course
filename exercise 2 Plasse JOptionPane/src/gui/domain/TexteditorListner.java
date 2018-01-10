package gui.domain;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.*;

public class TexteditorListner implements DocumentListener  {

	JTextArea text;
	
	public TexteditorListner(JTextArea text) {
		this.text = text;
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		setBackground(e);
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		setBackground(e);
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		//Plain text components do not fire these events (https://docs.oracle.com/javase/tutorial/uiswing/events/documentlistener.html)
	}
	
	private void setBackground(DocumentEvent e) {
		if(e.getDocument().getLength() > 0)
			text.setBackground(Color.YELLOW); 
		else
			text.setBackground(Color.WHITE);
	}
	
}
