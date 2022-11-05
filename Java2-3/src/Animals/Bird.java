package Animals;

public class Bird extends Animals implements flyingObject {
	private double flySpeed;
	private double altitude;
	
	public Bird(String name, int age, double d) {
		super(name, age);
		this.flySpeed = d;
	}

	public void Fly() {
		System.out.println("Flap..Flap..Flap..Flap.. at " + flySpeed + " km/h");
	}

	@Override
	public void Escalate() {
		altitude += 10;
	}

	@Override
	public void Lower() {
		altitude  -= 10;
	}
}
