package gui.domain;

import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import controller.Controller;

class Sourcepane extends Textpane {

	Sourcepane() {
		setDescriptions(Controller.actionopen);
	}

	void open() {
		if (fileDialog(JFileChooser.OPEN_DIALOG) == JFileChooser.APPROVE_OPTION) {
			sourcefile = jf.getSelectedFile();
			setText();
		}
	}

	String getText() {
		return textpane.getText();
	}

	void enableAction() {
		Controller.enableActiontidy(hasText());
	}

	private void setText() {
		String undo = textpane.getText();
		textpane.setText("");
		try {
			Scanner scanner = new Scanner(new FileReader(sourcefile));		
			while (scanner.hasNextLine()) {
				textpane.append(scanner.nextLine() + "\n");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingen fil:" + e);
			textpane.setText(undo);
		}
	}

}
