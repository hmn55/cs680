package edu.umb.cs.cs680.hw08v1;


import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;


public class DJIAQuoteObservableTest {

	DJIAQuoteObservable test = new DJIAQuoteObservable();
	 Set<Float> testData = new HashSet<Float>();
	@Before
	public void setup()
	{
		test.addObserver(new PieChartObserver());
	    test.addObserver(new TableObserver());
		test.addObserver(new ThreeDObserver());
	}
	
	@Test
	public void testObserver()
	{
		test.changeQuote(70);
		test.changeQuote(80);
		test.changeQuote(90);
		testData.add((float) 70);
		testData.add((float) 80);
		testData.add((float) 90);
		
		assertTrue(test.getData().containsAll(testData));
	}
}