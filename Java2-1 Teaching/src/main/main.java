package main;

import java.util.ArrayList;

import main.Dog.*;

public class main {
	public static void main(String[] args) {
		
		//Array
		
//		Dog[] dogs= new Dog[5];
//		
//		for (int i = 0; i < dogs.length; i++) {
//			dogs[i] = new Dog("Mojo", "German");
//		}
//		
//		for (int i = 0; i < dogs.length; i++) {
//			System.out.println(dogs[i].GetName());
//		}
	
		//ArrayList
		
		int numOfDogs = 2;
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		for (int i = 0; i < numOfDogs; i++) {
			Dog tempDog = new Dog("Mojo", "German");
			dogs.add(tempDog);
		}
		
		for (int i = 0; i < dogs.size(); i++) {
			System.out.println(dogs.get(i).GetName());
		}
		
		System.out.println( dogs.get(0).getDogsCreated() );
	}
}
