package main;

public class Dog {
	
	public static int NumberOfDogs = 0;
	public static Dog thousandDog = null;
	public String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		NumberOfDogs++;
		if (NumberOfDogs == 1000) {
			this.SetName("LuckyKeni");
			thousandDog = this;
		}
	}
	
	public Dog() {
		this("keni", 2000000);
	}
	
	public String GetName() {
		return name;
	}
	
	public int GetAge() {
		return age;
	}
	
	public void SetName(String value) {
		this.name = value;
	}
	
	public void SetAge(int value) {
		this.age = value;
	}

	
	
	
	
	private void SayName() {
		System.out.println("My name is " + name);
	}
	
	private void RegisterMother(DogMother myMom) {
		myMom.RegisterChild(this);
	}
	
}
