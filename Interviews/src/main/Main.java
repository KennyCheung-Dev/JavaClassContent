package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		System.out.println(Math.pow(2, 3));
//		System.out.println(Math.sqrt(9));
		
		int a = 1;
		int b = a;
		
		b = 5;  //a = 1  b = 5
		
		double h = 2.3;
		int ggg = (int) h;
		
		
		if (a > 10)
			if (a > 15)
				System.out.print("???");
			else
				System.out.println("??SEF?S?EF");
		
		
		

		mojo = new Dog();
		Dog fakeCat = new Dog();
		
		fakeCat = mojo;
		
		SendHome(fakeCat);
		
	}
	
	public static void SendHome(Dog[] arrayDog) {
		arrayDog = new Dog[5];  // Not going to affect the actual array outside
		
		arrayDog[0] = new Dog(); // Not going to affect the actual array outside
		
		arrayDog[0].age = 5;  // This will change the age of the dog
	}

}
