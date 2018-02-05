/*
 * Created on 10.mar.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui.domain;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.imageio.ImageIO;

public class Background extends MoveableComponent {

	Image image;
	String imgname = "http://www.wga.hu/art/c/cole/empire.jpg";
	
	public Background() {
		try {
			URL file = new URL(imgname);
			image = ImageIO.read(file);
		} catch (Exception e) {
		}
		setSize(image.getWidth(null), image.getHeight(null));
	}

	public void paint(Graphics g) {
		if (image != null) {
			g.drawImage(image, 0, 0, null);
		}
	}

}
