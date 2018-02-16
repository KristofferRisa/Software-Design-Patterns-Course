package controller;

import java.awt.BorderLayout;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import gui.MenuController;
import gui.domain.WindowObservable;

public class ZoomController extends JFrame  {
	private static final long serialVersionUID = 1110;
	private WindowObservable observable;
	
	public ZoomController(Observer o){
		
		setTitle("Control your Zoom");
		setLayout(new BorderLayout());
		
		observable =  new WindowObservable();
		observable.addObserver(o);

		JSlider slider = new JSlider(JSlider.VERTICAL,100, 400, 100);
		slider.setMajorTickSpacing(100);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                observable.setValue(slider.getValue());
            }
		});
		add(slider);
		
		setSize(100,250);
		setVisible(true);
	}
	
}
