package edu.umb.cs.cs680.hw08v1;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class StockQuoteObservableTest {
	StockQuoteObservable stockquoteobservabletest = new StockQuoteObservable();

	HashMap<String, Float> map = new HashMap<>();
	HashMap<String, Float> map2 = map;

	@Before
	public void setup() {
		stockquoteobservabletest.addObserver(new PieChartObserver());
		stockquoteobservabletest.addObserver(new TableObserver());
		stockquoteobservabletest.addObserver(new ThreeDObserver());
	}

	@Test
	public void testObserver() {
		stockquoteobservabletest.changeQuote("IBM", 70);
		stockquoteobservabletest.changeQuote("UMB", 80);
		stockquoteobservabletest.changeQuote("CCC", 90);
		map.put("IBM", (float) 70);
		map.put("UMB", (float) 80);
		map.put("CCC", (float) 90);

		// Shallow test comparison, same class, Hashmap
		Assert.assertEquals(stockquoteobservabletest.getMap().getClass(), map.getClass());
		// Deep comparison, the two objects must be the same in every way
		Assertions.assertEquals(stockquoteobservabletest.getMap(), map);

		// check contain same key
		Assert.assertTrue(stockquoteobservabletest.getMap().keySet().containsAll((map.keySet())));

		// uswes the equals mthod from Hashmap class
		Assert.assertTrue(map.equals(stockquoteobservabletest.getMap()));

	}
}
