package edu.umb.cs.cs680.hw08v1;

import java.util.HashSet;
import java.util.Set;

public class DJIAQuoteObservable extends Observable {
	private float quote;
	private Set<Float> data;

	public Set<Float> getData() {
		return data;
	}

	public DJIAQuoteObservable() {
		
		data = new HashSet<Float>();
	}

	public void changeQuote(float q) {
		if (quote != q) {
			quote = q;
			data.add(q);
			setChanged();
			System.out.println("DJIA Value changed");
			notifyObservers(new DJIAEvent(quote));
			
		} else {
			System.out.println("Value not changed");
		}

	}
}
