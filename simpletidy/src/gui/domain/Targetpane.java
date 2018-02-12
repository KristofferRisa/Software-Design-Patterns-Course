package gui.domain;

import java.io.File;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import controller.Controller;

class Targetpane extends Textpane {

	Targetpane() {
		setDescriptions(Controller.actionsave);
	}

	void setText(String string) {
		textpane.setText(string);
	}

	void save() {
		File targetfile = null;
		if ((targetfile = selectTargetFile()) != null) {
			try {
				PrintWriter pw = new PrintWriter(targetfile);
				pw.println(textpane.getText());
				pw.close();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Feil:" + e);
			}
		}
	}

	private File selectTargetFile() {
		if (fileDialog(JFileChooser.SAVE_DIALOG) == JFileChooser.APPROVE_OPTION) {
			return jf.getSelectedFile();
		}
		return null;
	}

	void enableAction() {
		Controller.enableActionsave(hasText());
	}

}
