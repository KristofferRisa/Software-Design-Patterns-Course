package gui.domain;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Htmlview extends JPanel {

	JLabel text = new JLabel("",JLabel.CENTER);

	public Htmlview() {		
		setLayout(new BorderLayout());
		add(new JScrollPane(text));
	}

	public void setText(String taggedtext) {
		text.setText("<html>"+taggedtext+"</html>");		
	}

}
