package RaceSimulation;

public class Car {
	private int speed;
	private int startLocation;
	private int currentLocation;
	
	public Car(int speed, int startLocation) {
		this.speed = speed;
		this.startLocation = startLocation;
		currentLocation = startLocation;
	}
	
	public void Run() {
		currentLocation += speed;
	}
	
	public int GetCurrentLocation() {
		return currentLocation;
	}
	
	public int GetSpeed() {
		return speed;
	}
	
	protected void SetSpeed(int value) {
		speed = value;
	}
}
