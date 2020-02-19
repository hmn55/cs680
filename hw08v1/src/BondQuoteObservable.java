package edu.umb.cs.cs680.hw08v1;

import java.util.HashMap;

public class BondQuoteObservable extends Observable {
	private HashMap<String, Float> map;
	public BondQuoteObservable() {
		map = new HashMap<>();
	}
	public  HashMap<String, Float> getMap() {
		return map;
	}
	public void changeQuote(String t, float q) {
		if (!map.containsKey(t) || map.get(t) != q) {
			this.map.put(t,q);
			setChanged();
			notifyObservers(new BondEvent(t, q));
		}
	}

		
	

}

	

	