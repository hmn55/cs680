package edu.umb.cs.cs680.hw08v1;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class BondQuoteObservableTest {
	BondQuoteObservable bondquoteobservabletest = new BondQuoteObservable();

	HashMap<String, Float> map = new HashMap<>();
	HashMap<String, Float> map2 = map;

	@Before
	public void setup() {
		bondquoteobservabletest.addObserver(new PieChartObserver());
		bondquoteobservabletest.addObserver(new TableObserver());
		bondquoteobservabletest.addObserver(new ThreeDObserver());
	}

	@Test
	public void testObserver() {
		bondquoteobservabletest.changeQuote("IBMbond", 70);
		bondquoteobservabletest.changeQuote("UMBbond", 80);
		bondquoteobservabletest.changeQuote("CCCbond", 90);
		map.put("IBMbond", (float) 70);
		map.put("UMBbond", (float) 80);
		map.put("CCCbond", (float) 90);

		// Shallow test comparison, same class, Hashmap
		Assert.assertEquals(bondquoteobservabletest.getMap().getClass(), map.getClass());
		// Deep comparison, the two objects must be the same in every way
		//Assertions.assertEquals(bondquoteobservabletest.getMap(), map);

		// check contain same key
		Assert.assertTrue(bondquoteobservabletest.getMap().keySet().containsAll((map.keySet())));

		// uswes the equals mthod from Hashmap class
		Assert.assertTrue(map.equals(bondquoteobservabletest.getMap()));

	}
}

