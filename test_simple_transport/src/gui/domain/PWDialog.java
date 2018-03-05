package gui.domain;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class PWDialog {

	private String pw = null;

	private void acquire() {
		if (pw == null) {
			password();
		}
	}

	public void password() {
		JPasswordField pwd = new JPasswordField();
		if (JOptionPane.showConfirmDialog(null, pwd, "Skriv passordet",
				JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
			pw = new String(pwd.getPassword());
		}
	}

	public String get() {
		acquire();
		return pw;
	}

}
