package Animals;

public class Bird {
	String name;
	int age;
	
	public Bird(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Speak() {
		System.out.println("Hello, I am " + name);
	}
	
	public void Fly() {
		System.out.println("Flap..Flap..Flap..Flap..");
	}
}
