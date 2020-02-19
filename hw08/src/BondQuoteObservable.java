package edu.umb.cs.cs680.hw08;

import java.util.Observable;
import java.util.Observer;

public class BondQuoteObservable extends Observable {
	private String watchedValue;

	public BondQuoteObservable(String value) {
		watchedValue = value;

	}

	public void setValue(String value) {
		if (watchedValue != value) {
			System.out.println("Bond value has changed to " + value);
			watchedValue = value;
			setChanged();
			notifyObservers(value);

		}
	}

}