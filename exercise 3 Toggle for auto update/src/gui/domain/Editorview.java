package gui.domain;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import controller.Controller;

public class Editorview extends JPanel implements DocumentListener {
		
	JTextArea text = new JTextArea();
	File file = new File (".");
	JFileChooser jf = new JFileChooser(file);
	
	public Editorview() {
		setLayout(new BorderLayout());
		add(new JScrollPane(text));
		text.getDocument().addDocumentListener(this);
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

	public void load() {		
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

	
	public void insertUpdate(DocumentEvent arg0) {
		Controller.testhtml();		
	}

	public void removeUpdate(DocumentEvent arg0) {
		Controller.testhtml();
		
	}

	public void changedUpdate(DocumentEvent arg0) {
		Controller.testhtml();		
	}
		
}
