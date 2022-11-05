package RaceCars;

public class RaceCar {
	private double speed;
	private double distTravelled;
	
	public RaceCar(double speed) {
		this.speed = speed;
	}
	
	public RaceCar(double speed, double startDistance) {
		this.distTravelled = startDistance;
		this.speed = speed;
	}
	
	public double ReportDist(double hoursPassed) {
		return distTravelled + hoursPassed * speed;
	}
}
