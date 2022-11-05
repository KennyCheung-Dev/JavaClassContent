package HomeworkAnswer;

public class ElectricCar extends Car {
	private int maximumRangeOnFullCharge;
	
	public ElectricCar(int VIN, int topSpeed, int weight, String maker, String model, Type vehicleType, int maximumRangeOnFullCharge) {
		super(VIN, topSpeed, weight, maker, model, vehicleType);
		this.maximumRangeOnFullCharge = maximumRangeOnFullCharge;
	}
	
	public int getMaximumRangeOnFullCharge() {
		return maximumRangeOnFullCharge;
	}
}
