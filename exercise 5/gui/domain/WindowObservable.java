package gui.domain;

import java.util.Observable;

public class WindowObservable extends Observable {

	public void setValue(int zoomLevel) {
		setChanged();
		notifyObservers(zoomLevel);
		clearChanged();		
	}
    	    
}
