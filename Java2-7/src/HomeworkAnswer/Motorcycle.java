package HomeworkAnswer;

public class Motorcycle extends Vehicle {
	private float maximumLeanAngle;
	
	public Motorcycle(int VIN, int topSpeed, int weight, String maker, String model, float maximumLeanAngle) {
		super(VIN, topSpeed, weight, maker, model);
		this.maximumLeanAngle = maximumLeanAngle;
	}
	
	public float getMaximumLeanAngle() {
		return maximumLeanAngle;
	}
}
