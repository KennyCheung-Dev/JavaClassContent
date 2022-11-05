package InheritanceExamples;

public class Bird extends Animal implements IFlyingObject {
	private int toxicFeathers;
	
	public Bird(String name, float deathAge, float deathSpeed, float speedMakeWeapon, int toxicFeathers) {
		super(name, deathAge, deathSpeed, speedMakeWeapon);
		this.toxicFeathers = toxicFeathers;
	}
	
	public void RadiateGammaEnergy() {
		
	}
	
	public void Eliminate(Dog others) {
		super.Eliminate(others);
		System.out.println("Hide All Dogs");
	}

	@Override
	public void Speak() {
		System.out.println("Chirp");
		
	}

	@Override
	public void Fly(float speed, float altitude) {
		System.out.println("Flying");
	}
}
