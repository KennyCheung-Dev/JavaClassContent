package java2;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String GetName() {
		return name;
	}
	
	public int GetAge() {
		return age;
	}
	
	public abstract void Speak();
	
	public void AdvanceAge() {
		age += 1;
	}
	
	public void EatFood() {
		System.out.println("fakwehbnaekfnouasf");
	}
}
