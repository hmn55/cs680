package edu.umb.cs.cs680.hw08;

import java.util.Observable;
import java.util.Observer;

public class ObservableDemo implements Observer {
	public static void main(String[] args) {
		System.out.println("Stock:");
		
		StockQuoteObservable observedStock = new StockQuoteObservable("Original Stock Value");
		ObservableDemo watcher = new ObservableDemo();
		observedStock.addObserver(watcher);
		observedStock.addObserver(new LineChartObserver());
		observedStock.addObserver(new PieChartObserver());
		observedStock.addObserver(new TableObserver());
		observedStock.addObserver(new ThreeDObserver());
		observedStock.setValue("New Value");
		System.out.println("");	
        System.out.println("Bond");


		BondQuoteObservable observedBond = new BondQuoteObservable("Original Bond Value");
		ObservableDemo watcher1 = new ObservableDemo();
		observedBond.setValue("First New Value");
		observedStock.addObserver(watcher1);	
		observedBond.addObserver(new LineChartObserver());
		observedBond.addObserver(new PieChartObserver());
		observedBond.addObserver(new TableObserver());
		observedBond.addObserver(new ThreeDObserver());
		observedBond.setValue("New Value");
		System.out.println("");
		System.out.println("DJIA:");
		
		DJIAQuoteObservable observedDow = new DJIAQuoteObservable("Original DJIA Value");
		ObservableDemo watcher11 = new ObservableDemo();
		
		observedDow.addObserver(watcher11);
		observedDow.addObserver(new LineChartObserver());
		observedDow.addObserver(new PieChartObserver());
		observedDow.addObserver(new TableObserver());
		observedDow.addObserver(new ThreeDObserver());
		observedDow.setValue("New Value");

	}

	public void update(Observable obj, Object arg) {
		System.out.println("Update called with arguments: " + arg);

	}
}