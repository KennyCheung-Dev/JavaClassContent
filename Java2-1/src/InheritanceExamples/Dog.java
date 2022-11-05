package InheritanceExamples;

public class Dog extends Animal{
	
	public float customVar = 0.01f;
	
	public Dog(String name, float deathAge, float deathSpeed, float speedMakeWeapon) {
		super(name, deathAge, deathSpeed, speedMakeWeapon);
	}
	
	@Override
	public void Speak() {
		System.out.println("Wuf");
		
	}
	
//	public boolean equals(Object o) {
//		if (!super.equals(o)) 
//			return false;
//		if (o != null && o.getClass() == this.getClass()) {
//			Dog otherDog = (Dog)o;
//			if (otherDog.customVar != customVar) 
//				return false;
//			return true;
//		}
//		return false;
//	}
	
	
	
}



