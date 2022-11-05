package main;
import Animals.*;

public class AnimalCrossing {

	public static void main(String[] args) {
		Bird bird1 = new Bird("Tweety", 2);
		Dolphin dol1 = new Dolphin("Sylvester", 6, 10);
		
		Pokemon dolphin2 = new Dolphin("Kenny", 3, 10);
		
		
		Pokemon[] catchEmAll = new Pokemon[2];
		catchEmAll[0] = new Dolphin("Sylvester", 6, 10);
		catchEmAll[1] = new Dolphin("Sylvester", 4, 120);
		
		for (int i = 0; i < catchEmAll.length; i ++) {
			catchEmAll[i].Speak();
//			try {
//				((Dolphin)catchEmAll[i]).Swim();
//			} catch (Exception e) {
//				((Bird)catchEmAll[i]).Fly();
//			}
//			System.out.println("Hello World");
		}
		
		bird1.Speak();
		dol1.Speak();
		
		bird1.Fly();
		dol1.Swim();
	}
	
	/* Polymorphism
	* Polymorphism is the mechanism of selecting the appropriate
	* method for a particular object in a class hierarchy. 
	*/  
	
	/*
	 * Homework : 
	 * Apply inheritance in the classes in RaceCar solution
	 * Apply polymorphism in the collection of cars in main
	 * 
	 * Dig online, and try to understand polymorphism
	 * Also try this short video:
	 * https://www.youtube.com/watch?v=tIWm3I_Zu7I
	 * 
	 * Write your own definition of Polymorphism
	 */
	

}
