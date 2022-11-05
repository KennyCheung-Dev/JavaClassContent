package main;

public class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		// If this object in the parameter is the same object as ourselves (even same reference)
		if (this == o) return true;
		
		// If this object in the parameter in is null or not
		if (o == null) return false;
		
		// Check if the object in the parameter is the same type to us
		if (o.getClass() != this.getClass()) return false;
		
		//Just in case, type cast it into Animals
		Animal other = (Animal) o;
		
		//Actually checking variable values
		if (age == other.age && name.equals(other.name)) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Homework:
	 * Override the .toString() method of Animals and Dog Class
	 * Provide actual useful information
	 * Such as printing : Animal { name = <name>, age = <age> }
	 * For Dog subclass, give also runSpeed
	 */
	
	public String toString() {
		return "Animal -  name: " + name + ", age: " + String.valueOf(age);
	}
	
	
	// Dog Dog1  -    new Dog()
	// Animal Dog2  -    new Dog()
	// Dog1.equals(Dog2);
}
