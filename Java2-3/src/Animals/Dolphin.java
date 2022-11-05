package Animals;

public class Dolphin extends Abs_Animal {
	public double swimSpeed;
	
	public Dolphin(String name, int age, double swimSpeed) {
		this.swimSpeed = swimSpeed;
		this.age = age;
		this.name = name;
	}
	
	public void Swim() {
		System.out.println("Sploosh..Sploosh..Sploosh..Sploosh.. at " + swimSpeed + " km/h");
	}

	@Override
	public void Drink() {
		//Drink through the hole in my back
	}
}
