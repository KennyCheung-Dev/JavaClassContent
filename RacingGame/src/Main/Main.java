package Main;

import java.util.ArrayList;

import Cars.*;

public class Main {
	static ArrayList<RaceCar> cars = new ArrayList<RaceCar>();
	static double hoursPassed;
	static double distThreshold = 0.01;
	
	public static void main(String[] args) {
		cars.add(new RaceCar(250.2563));
		cars.add(new RaceCar(230.2634, 150.0));
		
		//Loop through time and check collision
		while (true) {
			ReportCarsDistance();
			if (CheckCollision(cars.get(0), cars.get(1))) {
				System.out.println("Car1 catches up to Car2, at " + RoundToDecimal(hoursPassed, 1) + " hours.");
				break;
			}
			hoursPassed += 0.1;
		}
	}

	public static void ReportCarsDistance() {
		System.out.println("Time: " + RoundToDecimal(hoursPassed, 1) + " hours.");
		System.out.println("Car1 has travelled: " + RoundToDecimal(cars.get(0).ReportDist(hoursPassed), 4) + " km.");
		System.out.println("Car2 has travelled: " + RoundToDecimal(cars.get(1).ReportDist(hoursPassed), 4) + " km.");
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
