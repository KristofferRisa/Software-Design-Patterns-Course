package gui.domain;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Domainview extends JPanel {

	Editorview editorview;
	Htmlview htmlview;
	JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	
	public Domainview() {
		setLayout(new BorderLayout());
		split.setLeftComponent(editorview = new Editorview());
		split.setRightComponent(htmlview = new Htmlview());
		add(split);		
	}
	
	public void setDividers() {
		split.setDividerLocation(0.5);
	}

	public void open() {		
		editorview.load();		
	}

	public void save() {
		editorview.save();		
	}

	public void paste() {
		editorview.paste();		
	}

	public void testhtml() {
		htmlview.setText(editorview.getText());		
	}

	public void toggleHtmlView(boolean toggle) {
		split.setRightComponent(toggle ? htmlview : null);
		setDividers();
	}

}
