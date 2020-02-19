package edu.umb.cs.cs680.hw08;

import java.util.Observable;


public class StockQuoteObservable extends Observable {
	private String watchedValue;

	public StockQuoteObservable(String value) { 
		watchedValue = value; 

	}

	public void setValue(String value) {
		if (watchedValue != value) {
			System.out.println("Stock value has changed to " + value);
			watchedValue = value;
			setChanged();
			notifyObservers(value);

		}
	}
}
