package Animals;

public class Bird extends Pokemon{
	private String name;
	private int age;
	
	public Bird(String name, int age) {
		super(name, age);
	}
	
	public void Fly() {
		System.out.println("Flap..Flap..Flap..Flap..");
	}
}
