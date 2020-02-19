package edu.umb.cs.cs680.hw06;


import java.util.Comparator;

public class DominationComparator implements Comparator<Car> {

	public int compare(Car A, Car B) {
		return A.getDominationCount() - B.getDominationCount();

	}

}
