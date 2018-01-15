import gui.Maingui;

import javax.swing.UIManager;

public class Testeditor {

	public static void main(String[] args) {
		try {
		     UIManager.setLookAndFeel(
		       UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			
		}		
	
		new Maingui();
	}

}
