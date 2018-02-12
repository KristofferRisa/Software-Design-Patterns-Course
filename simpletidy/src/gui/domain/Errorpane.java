package gui.domain;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class Errorpane extends JPanel {

	private JTextArea textpane = new JTextArea();

	Errorpane() {
		setLayout(new BorderLayout());
		add(new JScrollPane(textpane));
	}

	void setText(String string) {
		textpane.setText(string);
		if (string.indexOf("Error:") != -1) {
			JOptionPane
					.showMessageDialog(this, "Ingen output? Studer feilmeldingene");
		}
	}

}
