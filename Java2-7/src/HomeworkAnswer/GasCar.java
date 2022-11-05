package HomeworkAnswer;

public class GasCar extends Car {
	private int tankCapacity;
	
	public GasCar(int VIN, int topSpeed, int weight, String maker, String model, Type vehicleType, int tankCapacity) {
		super(VIN, topSpeed, weight, maker, model, vehicleType);
		this.tankCapacity = tankCapacity;
	}
	
	public int getTankCapacity() {
		return tankCapacity;
	}
}
