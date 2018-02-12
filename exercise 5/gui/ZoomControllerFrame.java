package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import easylib.controller.ISupercontroller;
import gui.domain.OpticalZoom;
import gui.domain.WindowObservable;

public class ZoomControllerFrame extends JFrame implements ISupercontroller {	

	private WindowObservable observable;

	public ZoomControllerFrame(OpticalZoom zoom){
		
		setTitle("Control your Zoom");
		setLayout(new BorderLayout());
		//add(centerpane = new Centerpane(), BorderLayout.CENTER);
		
		observable =  new WindowObservable();
		observable.addObserver(zoom);
		
		setJMenuBar(new MenuController());

		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 5, 0);
	    //slider.setMinorTickSpacing(1);
	    slider.setMajorTickSpacing(1);
	    slider.setPaintTicks(true);
	    slider.setPaintLabels(true);
	    
		add(slider);
		
		slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                observable.setValue(slider.getValue());
            }
		});
		setSize(200,150);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void about() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatustext(String arg0) {
		// TODO Auto-generated method stub
		
	}
}
