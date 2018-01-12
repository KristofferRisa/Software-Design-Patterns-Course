package gui.domain;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;

public class Editorview extends JPanel {
		
	JTextArea text = new JTextArea();
	File file = new File (".");
	JFileChooser jf = new JFileChooser(file);
	
	public Editorview() {
		setLayout(new BorderLayout());
		add(new JScrollPane(text));
		text.getDocument().addDocumentListener(new DocumentListener() {
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
	
	public void save() {
		jf.setApproveButtonText("Lagre tekstfil");
		jf.setCurrentDirectory(file);
		jf.showSaveDialog(null);		
		if ((file = jf.getSelectedFile())!=null) {
			saveTo(file);
		}
	}
	
	private void saveTo(File f) {			
		try {
			FileOutputStream fo = new FileOutputStream(f);
			fo.write(text.getText().getBytes());
			fo.close();
		} catch (Exception e) {}				
	}

	public void open() {		
		jf.setApproveButtonText("Velg tekstfil");
		jf.setCurrentDirectory(file);
		jf.showOpenDialog(null);
		if ((file = jf.getSelectedFile())!=null) {			
			text.setText(loadFrom(file));
		}
	}
	
	private String loadFrom(File f) {		
		byte[] b = new byte[(int)f.length()];
		try {
			FileInputStream fi = new FileInputStream(f);
			fi.read(b);
		} catch (Exception e) {}
		return new String(b);
	}
		

	public String getText() {	
		return text.getText();
	}

	public void paste() {		
		text.paste();		
	}
	
	private void updateBackground() {
		if(text.getDocument().getLength() > 0)
			text.setBackground(new Color(240,240,140)); 
		else
			text.setBackground(new Color(255,255,255));
	}
	
}
