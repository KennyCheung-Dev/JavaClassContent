package Animals;

public class Dolphin {
	private String name;
	private int age;
	
	public Dolphin(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Speak() {
		System.out.println("Hello, I am " + name);
	}
	
	public void Swim() {
		System.out.println("Sploosh..Sploosh..Sploosh..Sploosh..");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
