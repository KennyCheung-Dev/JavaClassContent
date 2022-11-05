package HomeworkAnswer;

public class Boat extends Vehicle {
	private int maximumCarryingCapacity;
	
	public Boat(int VIN, int topSpeed, int weight, String maker, String model, int maximumCarryingCapacity) {
		super(VIN, topSpeed, weight, maker, model);
		this.maximumCarryingCapacity = maximumCarryingCapacity;
	}

	public int getMaximumCarryingCapacity() {
		return maximumCarryingCapacity;
	}
}
