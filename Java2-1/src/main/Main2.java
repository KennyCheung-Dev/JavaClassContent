package main;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		
		
//		ArrayList<Dog> dogList = new ArrayList<Dog>();
//		
//		
//		for (int i = 0; i < 1950; i++) {
//			dogList.add(new Dog());
//		}
//		
//		HPManager.Instance.GetHP();
		
//		System.out.println(Dog.thousandDog.GetName());
		
//		System.out.println(dogList.get(998).GetName());
//		System.out.println(dogList.get(999).GetName());
//		System.out.println(dogList.get(1000).GetName());
//		System.out.println(dogList.get(1001).GetName());
		
//		for (int i = 0; i < dogList.size(); i++) {
//			System.out.println(dogList.get(i).GetAge());
//		}

		
//		for (Dog theDog : dogList) {
//			System.out.println(theDog.GetAge());
//		}
		
//		System.out.println(Dog.NumberOfDogs);
//		
//		System.out.println(      dogList.get(0).name    );
//		
//		System.out.println(      dogList.get(0).NumberOfDogs    );
		
		/*
		Dog.NumberOfDogs  <-  static
		- Can be accessed from both Class (Dog) and instance (dogList.get(0))
		
		*/
	
		
// Changing values for Primitive type (ints)		
//		int num = 0;
//		num = 5;
//		
//		int num2 = num;
//
//		System.out.println(num);
//		System.out.println(num2);
//		
//		num = 2000;
//		
//		System.out.println(num);
//		System.out.println(num2);
//		
//		System.out.println("Num2 = " + num2);
		
		
// Changing reference for Reference type (Dog)
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.SetAge(10);
		dog2.SetAge(20);
		
//		System.out.println(dog1.GetAge());
//		System.out.println(dog2.GetAge());
		
		dog1 = dog2;
		
//		System.out.println(dog1.GetAge());
//		System.out.println(dog2.GetAge());
		
//		dog2.SetAge(90);
		
//		System.out.println(dog1.GetAge());
//		System.out.println(dog2.GetAge());
		
		
		
		
		//Demonstration on passing values/references through method argument
		float source = 1.0f;
		Dog mojo = new Dog("Adam", 2);
		
		ChangeValue(source);
		ChangeValue(mojo);
		
		System.out.println(source);
		System.out.println(mojo.GetAge());
	}
	
	public static void ChangeValue(float floatSource) {
		floatSource = 4.0f;
	}

	public static void ChangeValue(Dog dogSource) {
		dogSource.SetAge(100);
	}
	
}








/*

//Review for difference between foreach and for
int[] nums = new int[] {1, 2, 3, 4, 5};

//Foreach copy the value, can't change original
//for (int num : nums) {
//	num = 5;
//}

//For loop use index on original array, can change value
for (int i = 0; i < nums.length; i++) {
	nums[i] = 5;
}

for (int num : nums) {
	System.out.println(num);
}

*/




