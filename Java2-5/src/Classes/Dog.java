package Classes;

public class Dog extends Animal {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + runSpeed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (runSpeed != other.runSpeed)
			return false;
		return true;
	}

	private int runSpeed;

	public Dog(String name, int age, int runSpeed) {
		super(name, age);
		this.runSpeed = runSpeed;
		
	}

	
}
