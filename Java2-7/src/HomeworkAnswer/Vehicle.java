package HomeworkAnswer;

public abstract class Vehicle {
	private int VIN;
	private int topSpeed;
	private int weight;
	private String maker;
	private String model;
		
	public Vehicle(int VIN, int topSpeed, int weight, String maker, String model) {
		this.VIN = VIN;
		this.topSpeed = topSpeed;
		this.weight = weight;
		this.maker = maker;
		this.model = model;
	}
	
	public int getVIN() {
		return VIN;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public int getWeight() {
		return weight;
	}

	public String getMaker() {
		return maker;
	}

	public String getModel() {
		return model;
	}
}
