package InheritanceExamples;

public class Dolphin extends Animal {
	private float supersonicSwimSpeed;
	
	public Dolphin(String name, float deathAge, float deathSpeed, float speedMakeWeapon, float superSonicSwimSpeed) {
		super(name, deathAge, deathSpeed, speedMakeWeapon);
		this.supersonicSwimSpeed = supersonicSwimSpeed;
	}
	
	public void CreateHell() {
		System.out.println("This is hell now");
	} 
	
	public void Eliminate(Dog others) {
		super.Eliminate(others);
		//Extra functionality on override : Also Hide all existing Birds
		System.out.println("Hide All Birds");
	}
	
	@Override
	public void Speak() {
		System.out.println("Weeeeeeee");
		
	}
}
