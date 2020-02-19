package edu.umb.cs.cs680.hw06;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.Collections;


class Test {

	@org.junit.jupiter.api.Test	
	public void paretoTest() {
		ArrayList<Car> usedCars = new ArrayList<Car>();
		usedCars.add(new Car(10000, 2018, 15000, "Best"));
		usedCars.add(new Car(20000, 2010, 30000, "Middle"));
		usedCars.add(new Car(30000, 2005, 60000, "Worst"));
		for (int k = 0; k < usedCars.size(); k++)
			usedCars.get(k).setDominationCount(usedCars);
		Collections.sort(usedCars, new DominationComparator());		
		String actual = usedCars.get(0).getName();
		String expected = "Best";
		assertThat(actual, is(expected));
	}
		
		@org.junit.jupiter.api.Test	
		public void mileageTest() {
			ArrayList<Car> usedCars = new ArrayList<Car>();
			usedCars.add(new Car(10000, 2018, 15000, "Best"));
			usedCars.add(new Car(20000, 2010, 30000, "Middle"));
			usedCars.add(new Car(30000, 2005, 60000, "Worst"));
			for (int k = 0; k < usedCars.size(); k++)
				usedCars.get(k).setDominationCount(usedCars);
			Collections.sort(usedCars, new DominationComparator());	
			String actual = usedCars.get(0).getName();
			String expected = "Best";
			assertThat(actual, is(expected));
		}
		
		
		@org.junit.jupiter.api.Test	
		public void yearTest() {
			ArrayList<Car> usedCars = new ArrayList<Car>();
			usedCars.add(new Car(10000, 2018, 15000, "Best"));
			usedCars.add(new Car(20000, 2010, 30000, "Middle"));
			usedCars.add(new Car(30000, 2005, 60000, "Worst"));
			for (int k = 0; k < usedCars.size(); k++)
				usedCars.get(k).setDominationCount(usedCars);
			Collections.sort(usedCars, new DominationComparator());		
			String actual = usedCars.get(0).getName();
			String expected = "Best";
			assertThat(actual, is(expected));
		}
		
		@org.junit.jupiter.api.Test
		public void priceTest() {
			ArrayList<Car> usedCars = new ArrayList<Car>();
			usedCars.add(new Car(10000, 2018, 15000, "Best"));
			usedCars.add(new Car(20000, 2010, 30000, "Middle"));
			usedCars.add(new Car(30000, 2005, 60000, "Worst"));
			for (int k = 0; k < usedCars.size(); k++)
				usedCars.get(k).setDominationCount(usedCars);
			Collections.sort(usedCars, new DominationComparator());		
			String actual = usedCars.get(0).getName();
			String expected = "Best";
			assertThat(actual, is(expected));
		}
		
		
		
		
		
	}

