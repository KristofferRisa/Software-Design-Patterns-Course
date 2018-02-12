import gui.ApplicationFrame;

import javax.swing.UIManager;

/*
 * Created on 27.okt.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author vh
 * 
 * Entry point for klientguiet som skal koble seg opp mot Evalanche og be om
 * tjenester.
 */

public class Tidyclient {

	public static void main(String[] args) {
		try { // systemlike brukerkontroller
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		new ApplicationFrame();
	}
}
