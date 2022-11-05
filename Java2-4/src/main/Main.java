package main;

import java.util.ArrayList;

import RaceCars.*;

public class Main {
	static ArrayList<RaceCar> cars = new ArrayList<RaceCar>();
	static double hoursPassed;
	static double distThreshold = 0.01;
	
	public static void main(String[] args) {
		cars.add(new Toyota("TofuDelivery", 250.2563));
		cars.add(new Mazda("RX-7", 230.2634, 150.0));
		
		System.out.println("My First Car: " + cars.get(0).toString());
		
		//Loop through time and check collision
		while (true) {
			ReportCarsDistance();
			if (CheckCollision(cars.get(0), cars.get(1))) {
				System.out.println(((Toyota)cars.get(0)).GetUsage() + 
						" catches up to " + 
						((Mazda)cars.get(1)).GetModel() +
						", at " + RoundToDecimal(hoursPassed, 1) + " hours.");
				break;
			}
			hoursPassed += 0.1;
		}
	}

	public static void ReportCarsDistance() {
		System.out.println("Time: " + RoundToDecimal(hoursPassed, 1) + " hours.");
		System.out.println(((Toyota)cars.get(0)).GetUsage() + " has travelled: " + RoundToDecimal(cars.get(0).ReportDist(hoursPassed), 4) + " km.");
		System.out.println(((Mazda)cars.get(1)).GetModel() + " has travelled: " + RoundToDecimal(cars.get(1).ReportDist(hoursPassed), 4) + " km.");
	}
	
	public static boolean CheckCollision(RaceCar carX, RaceCar carY) {
		if (carY.ReportDist(hoursPassed) - carX.ReportDist(hoursPassed) < 0) {
			return true;
		}
		return false;
	}
	
	public static double RoundToDecimal(double value, int decimal) {
		int multiplier = 10;
		multiplier  = (int) Math.pow(multiplier, decimal);
//		System.out.println("Multiplier now: " + multiplier);
		return (double)Math.round(value * multiplier) / multiplier;
	}
}
