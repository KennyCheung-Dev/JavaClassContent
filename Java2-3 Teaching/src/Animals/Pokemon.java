package Animals;

public class Pokemon {
	private String name;
	private int age;
	
	public Pokemon(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Speak() {
		System.out.println("Hello, I am " + name);
	}
	
	public void Speak(String hi) {
		System.out.println("Hello, I am " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
