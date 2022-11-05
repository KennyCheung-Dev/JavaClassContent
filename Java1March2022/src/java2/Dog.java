package java2;

public class Dog extends Animal implements Drinkable {
	private String lastName;

	public Dog(String name, int age, String lastName) {
		super(name, age);
		this.lastName = lastName;
	}
	
	public String GetName() {
		return super.GetName() + lastName;
	}
	
	public int GetAge() {
		return super.GetAge();
	}
	
	public void Speak() {
		System.out.println("I am Danny");
	}
	
	public void AdvanceAge() {
		super.AdvanceAge();
		super.AdvanceAge();
		super.AdvanceAge();
		super.AdvanceAge();
		super.AdvanceAge();
		super.AdvanceAge();
		super.AdvanceAge();
		super.AdvanceAge();
		super.AdvanceAge();
	}
	
	public void EatDogFood() {
		System.out.println("yummy");
	}

	@Override
	public void BlendToLiquid() {
		System.out.println("AHHHHHHHHHH");
	}
	
}

