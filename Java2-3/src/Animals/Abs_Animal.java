package Animals;

//Abstract class cannot be instantiated as an instance
public abstract class Abs_Animal {
	protected String name;
	protected int age;
	
	public void Speak() {
		System.out.println("Hello, I am " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//Abstract Methods
	//Abstract methods is like a template
	//Does not have content
	//Only a frame, that has to be implemented in the subclass
	public abstract void Drink();
	
	/*
	 * Abstract Classes and Methods
	 * Abstract classes represent an abstract concept.
	 * Thus they may not be instantiated, and require subclasses to 
	 * provide implementations for the abstract methods
	 * 
	 * Abstract methods have no implementation code, just the method header. 
	 * The reasoning is that there is no good default code for the abstract method.
	 * 
	 * Abstract contain one or more abstract methods, but can also have concrete methods 
	 * (methods that are implemented)
	 * 
	 * If a class contains an abstract method, it MUST BE declared an abstract class
	 */
}
