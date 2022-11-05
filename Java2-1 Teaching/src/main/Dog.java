package main;

public class Dog {
	public static int numDogs;
	private int numberOfLegs = 4;
	private String name;
	private String breed;
	
//	_name = "PrivateToME"
//	publicName = "Hello My Name IS"
	
	//Getters and Setters
	//Getters: Allow you to retrieve private values - also called Accessor
	//Setters: Allow you to set private values - also called Mutator
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
		System.out.println("You have created a dog");
		numDogs++;
	}
	
	public Dog() {
		this("default", "default");
	}
	
	public void StartExtract() {
		this.ExtractNameAndBreed(this);
	}
	
	private String ExtractNameAndBreed(Dog aDog) {
		return aDog.breed + aDog.name;
	}
	
	public String GetName() {
		return name;
	}
	
	public void SetName(String enteredName) {
		this.name = enteredName;
	}
	
	public int getDogsCreated() {
		return numDogs;
	}
}
