package RaceSimulation;

public class Main {

	
	/*Homework 1:
		* Textbook Chapter 4 Multiple Choice No.1-14 p.151 - 157
		*
		*
		* Homework 2:
		* Create a simulation of two race cars, one catching up to another
		* Both cars need to be different brand, and inheritfrom the base Car class
		* Brand1: Mazda (Or whatever brand you love)
		* Brand2: Honda (Or whatever brand you love)
		*
		* These cars have shared properties like "startLocation", and "speed"
		* These cars CAN have unique properties like "acceleration" (Code it yourself if
		you decided to)
		*
		* The following methods and variables are required on both cars, and should be
		on base class:
		* Constructors
		* float startLocation
		* float currentLocation
		* float speed
		* void Run() <- Will be ran frequently to simulate running, updating current
		location

		* public float GetLocation <- Has to be public, will be used by main class
		*
		*
		* Ultimate goal:
		* In main class, create a simulation of a car starting behind catching up to
		another,
		* print outthe time ittook for the car to surpass.
		* */
	public static void main(String[] args) {
		Car ford1 = new Ford150(0, 0, 1);
		Car mercedes1 = new Mercedes(30, 20);
		int secondsPassed = 0;
		while (ford1.GetCurrentLocation() < mercedes1.GetCurrentLocation()) {
			ford1.Run();
			mercedes1.Run();
			System.out.println("Ford is at : " + ford1.GetCurrentLocation() + " and Mercedes is at : " + mercedes1.GetCurrentLocation() + " , Ford's speed is at : " + ford1.GetSpeed());
			secondsPassed++;
		}
		System.out.println("Time spent: " + secondsPassed);
	}

}
