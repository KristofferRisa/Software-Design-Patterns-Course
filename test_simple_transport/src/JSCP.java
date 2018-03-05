import gui.ApplicationFrame;

import javax.swing.UIManager;

/*
 * Created on 14.sep.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

final public class JSCP {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}

		new ApplicationFrame();
	}
}
