package RaceCars;

public class Mazda extends RaceCar {
	private String model;

	public Mazda(String model, double speed) {
		super(speed);
		this.model = model;
	}
	
	public Mazda(String model, double speed, double startDistance) {
		super(speed, startDistance);
		this.model = model;
	}
	
	public String GetModel() {
		return this.model;
	}
	
	public double ReportDist(double hoursPassed) {
		return 10;
	}
}
