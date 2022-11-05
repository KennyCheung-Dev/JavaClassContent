package InheritanceExamples;

public abstract class Animal {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(deathAge);
		result = prime * result + Float.floatToIntBits(deathSpeed);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(speedMakeWeapon);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (Float.floatToIntBits(deathAge) != Float.floatToIntBits(other.deathAge))
			return false;
		if (Float.floatToIntBits(deathSpeed) != Float.floatToIntBits(other.deathSpeed))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(speedMakeWeapon) != Float.floatToIntBits(other.speedMakeWeapon))
			return false;
		return true;
	}

	private String name;
	private float deathAge;
	private float deathSpeed;
	private float speedMakeWeapon;
	
	public Animal(String name, float deathAge, float deathSpeed, float speedMakeWeapon) {
		this.name = name;
		this.deathAge = deathAge;
		this.deathSpeed = deathSpeed;
		this.speedMakeWeapon = speedMakeWeapon;
		
	}
	
	public abstract void Speak();
	
	public void Eliminate(Dog others) {
		//Hide Dog Away
		System.out.println("Announce war");
	}
	
	public void Eliminate(Dog others, Bird other) {
		//Hide Dog Away
		System.out.println("Announce war");
	}
	
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		
//	    if (o == null || this.getClass() != o.getClass())
//	    	return false;
//		    
//		Animal animal = (Animal) o;
//		
//		if (deathAge == animal.deathAge && name.equals(animal.name))
//			return true;
//		else
//			return false;
//	}
	
	public String toString() {
		return "Animal { \n" +
				"Name: " + name + "\n" +
				"Speed Make Weapon: " + speedMakeWeapon + "\n" +
				"}";
	}
	
	
	
	/* Homework
	 * Clean up Dolphin and Dog class, extends from Animal superclass
	 * 
	 * Questions in Textbook Chapter 2 related to Reference types and Primitive Types
	 */
}
