package java1;

import java.util.ArrayList;

import java2.*;

public class Main3 {
	
	public static void main(String[] args) {
		Animal danny = new Dog("Hi", 1, "hi");
		Bird rex = new Bird("Hi", 1);
		
		ArrayList<Drinkable> drinkables = new ArrayList();
		drinkables.add((Drinkable) danny);
		drinkables.add(rex);
		
		drinkables.get(0).BlendToLiquid();
		drinkables.get(1).BlendToLiquid();
		
		
		danny.AdvanceAge();
		
		System.out.println(danny.GetAge());
		
		
		System.out.println(((int)(Math.random() * 51)) + 50);
		System.out.println(((int)(Math.random() * 30)) + 27);
		
		
	}
}