import gui.ApplicationFrame;

import javax.swing.UIManager;

public class Editor {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new ApplicationFrame();
	}

}
