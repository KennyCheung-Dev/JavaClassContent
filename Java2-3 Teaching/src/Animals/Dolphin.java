package Animals;

public class Dolphin extends Pokemon {
	///variables hidden///
	private double loudness;
	
	public Dolphin(String name, int age, int loudness) {
		super(name, age);
		this.loudness = loudness;
	}
	
	public void Speak() {
		super.Speak();
		System.out.println("I am super loud!");
	}

	public void Swim() {
		System.out.println("Sploosh..Sploosh..Sploosh..Sploosh..");
	}
}

/*
*	Rules for Subclasses
*	A subclass can add new private instance variables
*	A subclass can add new public, private, or static methods
*	A subclass can override inherited methods
*	A subclass may not redefine a public method as private
*	A subclass may not override static methods of the superclass
*	A subclass should define its own constructors
*	A subclass cannot directly access the private members of its 
*	superclass. It must use accessor or mutator methods.
*
*
*	Benefits for Overriding
*	The benefit of overriding is: ability to define a behavior 
*	that's specific to the subclass type, which means a subclass
*	can implement a parent class method based on its requirement.
*/

