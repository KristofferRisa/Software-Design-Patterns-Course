package easylib.propertyeditor;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Created on 24.nov.2004
 * 
 * @author vh
 *  
 */
class Editor extends JPanel {

	private JTextField textfield;

	Editor(String ex, boolean ispassw) {
		setLayout(new GridLayout(1, 0));
		add(new JLabel(ex + ": ", JLabel.RIGHT));
		textfield = (ispassw ? new JPasswordField() : new JTextField());
		add(textfield);
	}

	String getValue() {
		return noEndslash(textfield.getText());
	}

	void setValue(Object s) {
		textfield.setText(noEndslash(s));
	}

	private String noEndslash(Object s) {
		String r = s.toString().trim();
		while (r.endsWith("/") || r.endsWith(" ")) {
			r = r.substring(0, r.length() - 1);
		}
		return r;
	}
}
