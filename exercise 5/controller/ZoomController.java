package controller;

import java.awt.BorderLayout;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import gui.MenuController;
import gui.domain.WindowObservable;

public class ZoomController extends JFrame implements IActionlist {
	
	private WindowObservable observable;
	
	public ZoomController(Observer o){
		
		setTitle("Control your Zoom");
		setLayout(new BorderLayout());
		setJMenuBar(new MenuController());
		
		observable =  new WindowObservable();
		observable.addObserver(o);

		JSlider slider = new JSlider(JSlider.HORIZONTAL,1, 10, 1);
	    //slider.setMinorTickSpacing(1);
	    slider.setMajorTickSpacing(1);
	    slider.setPaintTicks(true);
	    slider.setPaintLabels(true);
	    
		add(slider);
		
		slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            		System.out.println("Zoom level: " + slider.getValue());
                observable.setValue(slider.getValue() + 100); // Denne må jeg eventuelt fiks litt på
            }
		});
		setSize(200,150);
		setLocationRelativeTo(null);
		setVisible(true);
	}


	
}
