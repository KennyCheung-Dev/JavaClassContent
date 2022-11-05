package java2;

public class Bird extends Animal implements Drinkable {

	public Bird(String name, int age) {
		super(name, age);
		age *= 9;
	}
	
	public void Speak() {
		System.out.println("Meow");
	}
	
	public int GetAge() {
		return super.GetAge();
	}

	@Override
	public void BlendToLiquid() {
		System.out.println("CHIRRRRRRRRP");
	}
}