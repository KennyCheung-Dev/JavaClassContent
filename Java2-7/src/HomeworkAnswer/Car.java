package HomeworkAnswer;

public class Car extends Vehicle {
	
	protected enum Type { 
		  FOURDOORS,
		  SEDAN,
		  COUPE,
		  HATCHBACK
		};
		
	Type vehicleType;
		
	public Car(int VIN, int topSpeed, int weight, String maker, String model, Type vehicleType) {
		super(VIN, topSpeed, weight, maker, model);
		this.vehicleType = vehicleType;
	}

	public Type getVehicleType() {
		return vehicleType;
	}
}
