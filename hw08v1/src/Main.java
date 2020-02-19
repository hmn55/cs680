package edu.umb.cs.cs680.hw08v1;
/*
 * Uses the deprecated Observable and Observer
 * from JDK8, copied and
 * pasted in this project
 * 
 * Observer: an interface, it only contains a method header: void update(Observable o, Object arg);
 * Each Observer: LineChartObserver, PieChartobserver, 3dObserver, Table Observer
 * implements its own update function---when called by the method update inside of Observable.notifyObservers, 
 * and called in Setvalue, which is called from the main-- to do something
 *  specific to each observer, like draw a graphical display or something, or send out an email, but 
 *  nothing is implemented here,just a print statement saying the that particular observer is being
 *  updated, and with what.
 *  
 * Observable: abstract class because it does contain methods with method bodies(not abstract), 
 * like notifyObservers()
 * also, contains non-final variable "changed", interfaces can only contain final variables,
 * observer contains no variable
 * 
 * values are changed by the client in the main using changeQuote(), a
 * method in each Observable child class that calls Notifyobservers() with a new Event object
 * Each event object holds one or two variables, and a constructor. The method
 * notify observers in observable takes the event object and calls update on each
 * observer that has been associated with the observable Object, a StockQuoteobservable, 
 * a BondQuoteObservable, or a DJIAQuoteObservable.
 * 
 */


public class Main {
	public static void main(String[] args) {
		
		StockQuoteObservable stockObservable = new StockQuoteObservable();
		stockObservable.addObserver(new LineChartObserver());
		stockObservable.addObserver(new PieChartObserver());
		stockObservable.addObserver(new TableObserver());
		stockObservable.addObserver(new ThreeDObserver());
		
		
		BondQuoteObservable bondObservable = new BondQuoteObservable();
		bondObservable.addObserver(new LineChartObserver());
		bondObservable.addObserver(new PieChartObserver());
		bondObservable.addObserver(new TableObserver());
		bondObservable.addObserver(new ThreeDObserver());
		
		
		DJIAQuoteObservable DJIA = new DJIAQuoteObservable();
		DJIA.addObserver(new LineChartObserver());
		DJIA.addObserver(new PieChartObserver());
		DJIA.addObserver(new TableObserver());
		DJIA.addObserver(new ThreeDObserver());
		
		
		stockObservable.changeQuote("Google", 110);
		bondObservable.changeQuote("Apple", 60);
		DJIA.changeQuote(27000);

	}

	
}