package Animals;

public class Animals {
	String name;
	int age;
	
	public Animals(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Speak() {
		System.out.println("Hello, I am " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
