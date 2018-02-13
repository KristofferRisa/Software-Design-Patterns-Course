package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ObserverManager {
	   private static ObserverManager instance = null;
	   protected ObserverManager() {
	      // Exists only to defeat instantiation.
	   }
	   public static ObserverManager getInstance() {
	      if(instance == null) {
	         instance = new ObserverManager();
	      }
	      return instance;
	   }
	   
	   public void AddObserver(Observer o) {
		   observers.add(o);
	   }
	   
	   public void RemoveObserver(Observer o) {
		   observers.remove(o);
	   }
	   
	   public List<Observer> GetObserver(){
		   return observers;
	   }
	   
	   private List<Observer> observers = new ArrayList<Observer>();
	}