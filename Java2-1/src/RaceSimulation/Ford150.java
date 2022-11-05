package RaceSimulation;

public class Ford150 extends Car {
	
	private int acceleration = 0;
	
	public Ford150(int speed, int startLocation, int acceleration) {
		super(speed, startLocation);
		this.acceleration = acceleration;
	}
	
	public void Run() {
		super.Run();
		SetSpeed(GetSpeed()  + acceleration);
	}
}
