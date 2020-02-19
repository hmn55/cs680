package edu.umb.cs.cs680.hw06;

import java.util.ArrayList;
import java.util.Collections;

public class Car {
	int price;
	int year;
	int mileage;
	String name;
	int dominationCount = 0;

	public Car(int price, int year, int mileage, String name) {
		this.price = price;
		this.year = year;
		this.mileage = mileage;
		this.name = name;
		this.dominationCount = 0;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getYear() {
		return year;
	}

	public float getMileage() {
		return mileage;
	}

	public int compare(Car o1, Car o2) {
		return 0;
	}

	public int setDominationCount(ArrayList<Car> List) {
		this.dominationCount = 0;
		for (int j = 0; j < List.size(); j++) {
			Car car = List.get(j);

			if ((car.mileage < this.mileage && car.price <= this.price && car.year >= this.year)
					|| (car.mileage <= this.mileage && car.price < this.price && car.year >= this.year)
					|| (car.mileage <= this.mileage && car.price <= this.price && car.year > this.year))
				this.dominationCount = this.dominationCount + 1;
		}

		return this.dominationCount;
	}

	public int getDominationCount() {
		return dominationCount;
	}

	public static void main(String[] args) {

		ArrayList<Car> usedCars = new ArrayList<Car>();

		usedCars.add(new Car(50000, 2005, 150000, "edsel"));
		usedCars.add(new Car(40000, 2011, 130000, "pontiac"));
		usedCars.add(new Car(50000, 2005, 165000, "buick"));

		System.out.println("Sorted by price:");
		Collections.sort(usedCars, new PriceComparator());
		for (Car item : usedCars) {
			System.out.println(item.getName());
		}
		System.out.println();
		System.out.println("Sorted by year:");
		Collections.sort(usedCars, new YearComparator());
		for (Car item : usedCars) {
			System.out.println(item.getName());
		}
		System.out.println();
		System.out.println("Sorted by mileage:");
		Collections.sort(usedCars, new MileageComparator());
		for (Car item : usedCars) {
			System.out.println(item.getName());
		}
		System.out.println();
		System.out.println("Sorted by Pareto comparison:");

		for (int k = 0; k < usedCars.size(); k++)
			usedCars.get(k).setDominationCount(usedCars);

		Collections.sort(usedCars, new DominationComparator());

		for (Car item : usedCars) {
			System.out.println(item.getName());
		}

	}

}
