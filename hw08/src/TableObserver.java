package edu.umb.cs.cs680.hw08;

import java.util.Observable;
import java.util.Observer;

public class TableObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Table chart is updated with " + arg);
if(o instanceof StockQuoteObservable)
	System.out.println("Stock event happened, updating table");
else if(o instanceof BondQuoteObservable)
	System.out.println("Bond event happened, updating table");
else if(o instanceof DJIAQuoteObservable)
	System.out.println("DJIA event happened, updating table");
else
	System.out.println("Event is not recognized");
	}

}
