package edu.umb.cs.cs680.hw08;

import java.util.Observable;
import java.util.Observer;

public class LineChartObserver implements Observer {

	@Override
	public void update(Observable o, Object arg1) {
		System.out.println("Line chart is updated with " + arg1);
		if(o instanceof StockQuoteObservable)
			System.out.println("Stock event happened, updating Line Chart");
		else if(o instanceof BondQuoteObservable)
			System.out.println("Bond event happened, updating Line Chart");
		else if(o instanceof DJIAQuoteObservable)
			System.out.println("DJIA event happened, updating Line Chart");
		else
			System.out.println("Event is not recognized"); 
	}
}
