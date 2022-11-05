package main;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		/*
		 * Learned:
		 * How to write classes
		 * How to give the class instance variables and methods
		 * How to write constructors
		 * How to use this keyword (part of it)
		 * How to Instantiate a class instance
		 * How to call a method on the instance 
		 */
		
//	
		DogMother mom = new DogMother();
		
		Dog dogo = new Dog();
//		dogo.SayName();
		System.out.println(dogo.GetName());
		System.out.println(dogo.GetAge());
		
//		dogo.RegisterMother(mom);
//		System.out.println(mom.child);
		
//		
//		Dog dogo2 = new Dog("Mojo", 20);
//		dogo2.SayName();
		
		int[] nums4 = new int[] {1, 2, 3, 999};
		
		System.out.println(  Math.Sum(nums4)  );
		
		
		
		
		ArrayList<Dog> dogList = new ArrayList<Dog>();

		//Add ArrayList Item
		
		Dog peter = new Dog();
		dogList.add(peter);
		dogList.add(new Dog());
		
		//Get Item
		System.out.println(dogList.get(0).GetAge());
		
		//Remove item by index
		dogList.remove(0);
		
		//Remove item by item reference
		dogList.remove(peter);
		
		
		//Get size of arraylist, # of items
		System.out.println(dogList.size());
		
//		dogList.remove();
		
		
		
	}
	
	/*
	 * Homework:
	 * - Read Textbook chapter on Class and specifically the Class-Static topic
	 * - Refactor your existing class variables and methods
	 * 	- Use as much private as you can
	 *  - Use some getters and setters
	 *  - Create a field with ArrayList, 
	 *  	- Use get(), size(), remove() on it
	 */
}
