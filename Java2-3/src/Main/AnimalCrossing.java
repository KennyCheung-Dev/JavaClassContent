package Main;
import Animals.*;

public class AnimalCrossing {

	public static void main(String[] args) {
		Bird bird1 = new Bird("Tweety", 2, 256.0);
		Dolphin dol1 = new Dolphin("Sylvester", 6, 175.4);
		
		bird1.Speak();
		bird1.Fly();
		
		dol1.Speak();
		dol1.Swim();
		
		System.out.println(bird1.toString()); 
		
		Abs_Animal dolphin = new Dolphin("Dol1", 10, 5);
//		Abs_Animal dolphin2 = new Dolphin("Dol1", 10, 5);
		Abs_Animal dolphin2 = dolphin;
		
		System.out.println(dolphin == dolphin2); 
		
		
	}
}
