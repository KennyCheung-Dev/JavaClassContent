package RaceCars;

public class Toyota extends RaceCar {
	private String usage;

	public Toyota(String usage, double speed) {
		super(speed);
		this.usage = usage;
	}
	
	public Toyota(String usage, double speed, double startDistance) {
		super(speed, startDistance);
		this.usage = usage;
	}
	
	public String GetUsage() {
		return this.usage;
	}
}
