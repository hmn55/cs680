package edu.umb.cs.cs680.hw08;
import java.util.Observable;
import java.util.Observer;

public class ThreeDObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof StockQuoteObservable)
			System.out.println("Stock event happened, updating 3DChart");
		else if(o instanceof BondQuoteObservable)
			System.out.println("Bond event happened, updating 3DChart");
		else if(o instanceof DJIAQuoteObservable)
			System.out.println("DJIA event happened, updating 3DChart");
		else
			System.out.println("Event is not recognized");
	}
}
