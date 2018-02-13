import controller.ObserverManager;
import controller.ZoomController;
import gui.*;

/*
 * Created on 06.mar.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author segovia
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class TestTransparent {

	public static void main(String[] args) {
		new ApplicationFrame();
		new ZoomController(ObserverManager.getInstance());
	}
}
