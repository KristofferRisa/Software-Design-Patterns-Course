package gui.domain;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import model.HtmlFilter;



abstract class Textpane extends JPanel implements DocumentListener {

	static protected File sourcefile = new File(".");
	protected JFileChooser jf = new JFileChooser(sourcefile);
	protected JTextArea textpane = new JTextArea();
	protected String shorttext, longtext;

	{
		jf.setFileFilter(new HtmlFilter());
		textpane.getDocument().addDocumentListener(this);
		setLayout(new BorderLayout());
		add(new JScrollPane(textpane)); // Decorator
	}

	abstract void enableAction();

	public void changedUpdate(DocumentEvent e) {
		enableAction();
	}

	public void insertUpdate(DocumentEvent e) {
		enableAction();
	}

	public void removeUpdate(DocumentEvent e) {
		enableAction();
	}

	void setDescriptions(Action a) {
		shorttext = a.getValue(Action.SHORT_DESCRIPTION).toString();
		longtext = a.getValue(Action.LONG_DESCRIPTION).toString();
	}

	protected int fileDialog(int dialog) {
		jf.setDialogType(dialog);
		jf.setDialogTitle(longtext);
		jf.setCurrentDirectory(sourcefile);
		return jf.showDialog(this, shorttext);
	}

	protected boolean hasText() {
		return !"".equals(textpane.getText());
	}

}
